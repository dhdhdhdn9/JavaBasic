package sjk.basic.day19;

import sjk.basic.sungjuk.SungJukVO;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class BoardServiceImpl implements BoardService {

    private static BoardDAO bdao;
    private static BoardService bsrv;

    private BoardServiceImpl() {
        bdao = BoardDAOImpl.getInstance();
    }

    public static BoardService getInstance() {
        if (bsrv == null) bsrv = new BoardServiceImpl();
        return bsrv;
    }



    @Override
    public void displayMenu() {
        String displaymenu =
                "==================== \n" +
                        "   게시글 프로그램 \n" +
                        "==================== \n" +
                        "1. 게시글 작성 \n" +
                        "2. 게시글 목록 \n" +
                        "3. 게시글 상세조회 \n" +
                        "4. 게시글 수정 \n" +
                        "5. 게시글 삭제 \n" +
                        "0. 프로그램 종료 \n" +
                        "==================== \n" +
                        "작업 선택 : " ;

        System.out.print(displaymenu);
    }

    @Override
    public void newBoard() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("게시물 작성");
            System.out.print("제목: ");
            String title = sc.next();
            System.out.print("아이디: ");
            String userid = sc.next();
            System.out.println("--본문--");
            String contents = sc.next();

            BoardVO bvo = new BoardVO(
                    null, title, userid, null,
                    null, null, contents);

            int cnt = bdao.insertBoard(bvo);
            if (cnt > 0) System.out.println("새로운 게시글이 등록되었습니다.");

        } catch (Exception ex) {
            System.out.println("다시 작성해주세요");
            return;
        }


    }

    @Override
    public void readBoard() {
        System.out.println(" 번호 | 글쓴이 | 제목 | 등록일 | 추천 | 조회수 ");
        String fmt =
                " %s | %s | %s | %s | %s | %s \n ";

        ArrayList<BoardVO> bdlist =
                (ArrayList<BoardVO>) bdao.selectBoard();

        StringBuffer sb = new StringBuffer();
        for (BoardVO bvo : bdlist) {
            String result = String.format(fmt,
                    bvo.getDbno(), bvo.getTitle(), bvo.getUserid(),
                    bvo.getRegdate(), bvo.getThumbup(), bvo.getViews());
            sb.append(result);
        }
        System.out.println(sb.toString());
    }

    @Override
    public void readOneBoard() {
        String fmt = " 제목 : %s \n" +
                " 작성자 : %s \n" +
                " 작성일 : %s \n" +
                " 조회수 : %s \n" +
                " ---------- \n" +
                " %s \n" +
                " ---------- \n" +
                " [ 추천 %s ] ";

        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("조회할 게시글 번호 : ");
            String bdno = sc.next();
            BoardVO bvo = bdao.selectOneBoard(bdno);

            String result = String.format(fmt, bvo.getUserid(), bvo.getTitle(),
                    bvo.getRegdate(), bvo.getContents(), bvo.getViews(), bvo.getThumbup());
            System.out.println(result);

            System.out.println("추천하시겠습니까? (Y/N)");
            String thumbup = sc.next();
            if ( thumbup.toUpperCase().equals("Y"))
                bdao.thumbupBoard(bdno);    // 본문글 추천하기

        } catch (Exception ex) {
            System.out.println("존재하지 않는 게시글입니다.");
            return;
        }

    }

    @Override
    public void modifyBoard() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("수정할 게시글 번호 : ");
            String bdno = sc.next();
            System.out.print("제목: ");
            String title = sc.next();
            System.out.println("--본문--");
            String contents = sc.next();

            BoardVO bvo = new BoardVO(
                    null, title, null,null,
                    null,null, contents
                    );
            bvo.setDbno(bdno);

            int cnt = bdao.updateBoard(bvo);
            if(cnt > 0) System.out.println("게시글 수정 완료");

        } catch (Exception ex) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

    }

    @Override
    public void removeBoard() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("삭제할 게시글 번호 : ");
            String bdno = sc.next();

            int cnt = bdao.deleteBoard(bdno);
            if(cnt > 0) System.out.println("게시글이 삭제되었습니다.");

        } catch (Exception ex) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

    }
}
