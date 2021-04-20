package sjk.basic.day16;

import java.sql.Connection;
import java.sql.DriverManager;

public class HelloJDBC {
    public static void main(String[] args) {
//        JDBC
//        java database connectivity
//        자바 프로그래밍 언어를 통해 다양한 관계형 데이터베이스에 접속하고
//        SQL문을 실행하여 관리하고자할 때 사용하는 표준 SQL 인터페이스
//        이것을 통해 데이터베이스 코드를 한번만 작성해주면
//        어떤 DBMS라도 코드 변경 없이 동일하게 작동할 수 있다.

//        JDK에 포함된 JDBC인터페이스는 java.sql 패키지 아래에 있다.
//        하지만, 이것만으로는 작동하지 않으며
//        각 데이터베이스 제조사가 JDBC 인터페이스를 구현해서
//        작성한 클래스가 필요한데, 이것을 JDBC 드라이버 매니저라 한다.
//        JDBC 드라이버 매니저는 데이터 베이스 제조사 홈페이지에서
//        내려 받을 수 있다.

//        amazon 데이터베이스 접속 확인
        String drv = "org.mariadb.jdbc.Driver";
//        String amz = "주소";
//        String url = "jdbc:mariadb://"+주소+":[code]/bigdata";
        String usr = "bigdata";
//        String pwd = "비밀번호";

//        1. JDBC 드라이버를 메모리에 초기화
        try {
            Class.forName(drv);
        } catch (ClassNotFoundException ex) {
            System.out.println("마리아DB 드라이버를 확인하세요.");
        }

//        2. 데이터베이스 서버 접속
//        try ( Connection conn =
//                      DriverManager.getConnection(url, usr, pwd)
//        ) { if (conn != null)
//            System.out.println("마리아DB 데이터 베이스 연결 성공");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

//        oracle용 drv, url
//        drv : oracle.jdbc.OracleDriver
//        url : jdbc:oracle:thin:@[vmware주소]:[code]/xe
        String odrv = "oracle.jdbc.OracleDriver";
//        String ourl = "";
        String ousr = "system";

//        postgresql용 drv, url
//        drv : org.postgresql.Driver
//        url : jdbc:postgresql://[vmware주소]:[code]/postgres
        String pdrv = "org.postgresql.Driver";
//        String purl = "";
        String pusr = "postgres";


//        3. vmware에 구축된 oracle 서버 접속 테스트

//        try {
//            Class.forName(odrv);
//        } catch (ClassNotFoundException ex) {
//            System.out.println("오라클 드라이버를 확인하세요.");
//        }
//
//        try ( Connection conn =
//                      DriverManager.getConnection(ourl, ousr, pwd)
//        ) { if (conn != null)
//            System.out.println("오라클 데이터 베이스 연결 성공");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }


//        4. vmware에 구축된 postgres 서버 접속 테스트

//        try {
//            Class.forName(pdrv);
//        } catch (ClassNotFoundException ex) {
//            System.out.println("포스트그레 드라이버를 확인하세요.");
//        }
//
//        try ( Connection conn =
//                      DriverManager.getConnection(purl, pusr, pwd)
//        ) { if (conn != null)
//            System.out.println("포스트그레 데이터 베이스 연결 성공");
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }





    }
}
