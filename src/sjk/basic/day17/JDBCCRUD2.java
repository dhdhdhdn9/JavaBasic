package sjk.basic.day17;

import java.sql.*;
import java.util.ResourceBundle;

public class JDBCCRUD2 {
    public static void main(String[] args) throws ClassNotFoundException {
//        ex. playground 데이터베이스의 books 테이블에 저장된
//        데이터들을 조회하는 프로그램 작성
//        조회대상: 모든 컬럼

//        JDBC 접속 정보
        String pkpath = "sjk.basic.jdbc.jdbc";
        ResourceBundle rb =
                ResourceBundle.getBundle(pkpath);
        String drv = rb.getString("mdrv");
        String url = rb.getString("murl");
        String usr = rb.getString("musr");
        String pwd = rb.getString("mpwd");

//        JDBC 관련 sql 정의
        String readAll = " select * from books ";
        String readAll2 = " select bookname, price from books ";
        String readOne = " select * from books where publish = 'oracle' ";


        Class.forName(drv);

        try ( Connection conn =
                      DriverManager.getConnection(url, usr, pwd);
                Statement stmt = conn.createStatement();

                ResultSet rs = stmt.executeQuery(readAll)
//                지정한 SQL을 실행하고, 결과의 집합을 받아옴
//                단, select 실행 시에만 사용
        ) {
            StringBuffer sb = new StringBuffer();
//            처리속도를 올리기 위한 Buffer
            while(rs.next()) {
//                결과집합에서 불러올 데이터가 없을 때까지 다음 반복
                sb.append(rs.getString(1))
//                결과집합에서 첫번째 컬럼의 값을 문자형태로 읽어옴
                    .append(rs.getString("bookname"))
//                결과집합에서 bookname 컬럼의 값을 문자형태로 읽어옴
                    .append(rs.getString(3))
                    .append(rs.getString(4))
                    .append("\n");
            }
            System.out.println(sb.toString());

        } catch(Exception ex) {
            ex.printStackTrace();
        }


//        readAll2
        try ( Connection conn =
                      DriverManager.getConnection(url, usr, pwd);
              Statement stmt = conn.createStatement();

              ResultSet rs = stmt.executeQuery(readAll2)
//                지정한 SQL을 실행하고, 결과의 집합을 받아옴
//                단, select 실행 시에만 사용
        ) {
            StringBuffer sb = new StringBuffer();
//            처리속도를 올리기 위한 Buffer
            while(rs.next()) {
//                결과집합에서 불러올 데이터가 없을 때까지 다음 반복
                sb.append(rs.getString(1)).append(" ")
                    .append(rs.getString(2)).append(" ")
                        .append("\n");
            }
            System.out.println("책이름과 가격 출력 결과");
            System.out.println(sb.toString());

        } catch(Exception ex) {
            ex.printStackTrace();
        }







//        readOne

        try ( Connection conn =
                      DriverManager.getConnection(url, usr, pwd);
              Statement stmt = conn.createStatement();

              ResultSet rs = stmt.executeQuery(readOne)
//                지정한 SQL을 실행하고, 결과의 집합을 받아옴
//                단, select 실행 시에만 사용
        ) {
            String fmt = "%s / %s / %s / %s \n";
            StringBuffer sb = new StringBuffer();
//            처리속도를 올리기 위한 Buffer

            while(rs.next()) {
                String result = String.format(fmt,
                sb.append(rs.getString(1)),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4));
                    sb.append(result);
            }
            System.out.println("oracle이 출판한 책 출력 결과");
            System.out.println(sb.toString());

        } catch(Exception ex) {
            ex.printStackTrace();
        }





    }
}
