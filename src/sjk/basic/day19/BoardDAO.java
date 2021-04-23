package sjk.basic.day19;

import java.util.List;

public interface BoardDAO {

    int insertBoard(BoardVO bvo);
    List<BoardVO> selectBoard();
    BoardVO selectOneBoard(String bdno);
    int updateBoard(BoardVO bvo);
    int deleteBoard(String dbno);

    void thumbupBoard(String bdno);


}
