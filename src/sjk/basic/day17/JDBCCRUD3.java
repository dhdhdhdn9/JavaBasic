package sjk.basic.day17;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class JDBCCRUD3 {
    public static void main(String[] args) {
//        ex. playground 데이터베이스의 books 테이블에 저장된
//        저장된 데이터들 중에서 출판사가 oracle인 도서의
//        제목을 python으로 변경

        MariaJDBC jdbc = new MariaJDBC();

        String sql = " update books set bookname = 'phython' " +
                " where publish = 'oracle' ";

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            int cnt = pstmt.executeUpdate();
            if (cnt >0) System.out.println("데이터 수정 완료");
        } catch (Exception ex) {
            ex.printStackTrace();
        }



//        ex. playground 데이터베이스의 books 테이블에 저장된
//        저장된 데이터들 중에서 이름이 python인 도서를 삭제

        sql = " delete from books where bookname = 'python' ";

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(sql);
        ) {
            int cnt = pstmt.executeUpdate();
            if (cnt > 0) System.out.println("데이터 삭제 완료");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }   // main
}   // class
