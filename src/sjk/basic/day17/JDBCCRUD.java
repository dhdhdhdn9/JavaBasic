package sjk.basic.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JDBCCRUD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        ex. playground 데이터베이스에서 books 테이블을 생성하고
//        새로운 도서정보를 입력하는 프로그램 작성
//        컬럼 정보: book, bookname, publish, price
//        입력방법은 Scanner 클래스 이용

//        JDBC 접속 정보
        String pkpath = "sjk.basic.jdbc.jdbc";
        ResourceBundle rb =
                ResourceBundle.getBundle(pkpath);
        String drv = rb.getString("mdrv");
        String url = rb.getString("murl");
        String usr = rb.getString("musr");
        String pwd = rb.getString("mpwd");


//        JDBC 관련 sql 정의
        String books = "create table books (bookid int," +
                "bookname varchar(30), publish varchar(30), " +
                "price int)";
        String newbooksql = "insert into books " +
                " values (99999, 'hello, java', 'oracle', 10000) ";
        String newbooksql2 = "insert into books " +
                " values (%d, '%s', '%s', %d) ";


//        JDBC 작업 시작
        Class.forName(drv); // JDBC 드라이버 메모리에 적재

        try (Connection conn =
                      DriverManager.getConnection(url, usr, pwd);
//             드라이버 매니저를 이용해서
//             DBMS에 접속하고 세션을 하나 가져옴
              Statement stmt = conn.createStatement();
//              연결된 세션을 통해 SQL을 실행할 수 있도록 statement 객체 생성
        ) {
            boolean isOk = stmt.execute(books);
//            지정한 SQL을 실행하고 결과를 받아옴
//            단, insert, update, delete 실핼 시 사용함

            if (isOk) System.out.println("도서 테이블 생성");
        } catch (Exception ex) {
//            ex.printStackTrace();
            System.out.println("테이블이 이미 존재하거나 시스템에 오류가 발생했습니다.");
        }

        try(
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
            Statement stmt = conn.createStatement();
            ) {
                boolean isOk = stmt.execute(newbooksql);
                if(isOk) System.out.println("데이터 저장 성공");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        Scanner로 데이터 입력 받아 테이블에 저장
        Scanner sc = new Scanner(System.in);
        System.out.println("도서번호 도서명 출판사 가격을 입력하시오");
        int bookid = Integer.parseInt(sc.next());
        String bookname = sc.next();
        String publish = sc.next();
        int price = Integer.parseInt(sc.next());

        String sql = String.format(
                newbooksql2, bookid, bookname, publish, price);
        System.out.println(sql);
//        입력받은 값을 이용해서 완전히 sql문으로 작성

        try(
                Connection conn =
                        DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();
        ) {
            boolean isOk = stmt.execute(sql);
            if(isOk) System.out.println("입력된 데이터 저장 성공");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
