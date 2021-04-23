package sjk.basic.day19;

import sjk.basic.jdbc.JDBCUtil;
import sjk.basic.sungjuk.SungJukVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDAOImpl implements BoardDAO {

    private static BoardDAO bdao = null;
    private JDBCUtil jdbc = null;

    private BoardDAOImpl() {
        jdbc = new JDBCUtil();
    }

    public static BoardDAO getInstance() {
        if (bdao == null) bdao = new BoardDAOImpl();
        return bdao;
    }


    private String insertSQL =
            " insert into board (title, userid, contents) \n " +
                    " values (?, ?, ?) ";

    private String selectSQL =
            " SELECT bdno, userid, title, mid(regdate, 1, 10) regdate, " +
                    " thumbup, views \n " +
                    " from board \n " +
                    " order by bdno desc ";

    private String selectOneSQL =
            " SELECT * from board where bdno = ? ";

    private String viewSQL =
            " update board set views = views + 1 " +
                    " where bdno = ? ";

    private String thumbSQL =
            " update board set thumbup = thumbup + 1 " +
                    " where bdno = ? ";

    private String updateSQL =
            " UPDATE board\n" +
                    "set title = ?, contents = ? \n" +
                    "where bdno = ?; ";

    private String deleteSQL =
            " DELETE from board where bdno = ? ";



    @Override
    public int insertBoard(BoardVO bvo) {
        int cnt = 0;

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(insertSQL);
        ){
            pstmt.setString(1, bvo.getTitle());
            pstmt.setString(2, bvo.getUserid());
            pstmt.setString(3, bvo.getContents());

            cnt = pstmt.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cnt;
    }



    @Override
    public List<BoardVO> selectBoard() {
        List<BoardVO> blist = new ArrayList<>();
        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(selectSQL);
                ResultSet rs = pstmt.executeQuery();
        ) {
            while (rs.next()) {
                BoardVO bvo = new BoardVO(
                        rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6),
                        null
                );
                blist.add(bvo);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return blist;
    }



    @Override
    public BoardVO selectOneBoard(String bdno) {
        BoardVO bvo = null;
        try (
            Connection conn = jdbc.openConn();
            PreparedStatement pstmt1 = conn.prepareStatement(viewSQL);
        ){
            pstmt1.setString(1, bdno);
            pstmt1.executeUpdate();  // 조회수 증가

            try (
                    PreparedStatement pstmt2 = conn.prepareStatement(selectOneSQL);
            ) {
            pstmt2.setString(1, bdno);
            ResultSet rs = pstmt2.executeQuery();
            while (rs.next()) {
                bvo = new BoardVO(
                        null, rs.getString(2),
                        rs.getString(3), rs.getString(4),
                        rs.getString(5), rs.getString(6),
                        rs.getString(7)
                );
            }
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return bvo;
    }



    @Override
    public int updateBoard(BoardVO bvo) {
        int cnt = 0;
        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(updateSQL);
        ){
            pstmt.setString(1, bvo.getTitle());
            pstmt.setString(2, bvo.getContents());
            pstmt.setString(3, bvo.getDbno());

            cnt = pstmt.executeUpdate();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cnt;
    }



    @Override
    public int deleteBoard(String dbno) {
        int cnt = 0;
        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(deleteSQL);
        ){
            pstmt.setString(1, dbno);
            cnt = pstmt.executeUpdate();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return cnt;
    }



    @Override
    public void thumbupBoard(String bdno) {

        try(
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(thumbSQL);
                ){
            pstmt.setString(1, bdno);
            pstmt.executeUpdate();


        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }


}
