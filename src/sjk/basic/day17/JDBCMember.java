package sjk.basic.day17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ResourceBundle;
import java.util.Scanner;

public class JDBCMember {
    public static void main(String[] args) {



//        네이버 회원가입 기능을 JDBC로 구현
//        테이블명: NMember (playground)
//        테이블 컬럼 구성: 아이디, 비밀번호, 이름, 생년월일, 성별 본인확인이메일, 휴대전화
//        자동입력 컬럼: 회원번호, 가입일
//        mbno(PK), userid, passwd, name, birth, gender, email, hp, regdate

        MariaJDBC jdbc = new MariaJDBC();

//        회원가입 테이블
//        String NMember = "create table NMember " +
//                "(  mbno    int         auto_increment primary key," +
//                "   userid  varchar(20) not null," +
//                "   passwd  varchar(20) not null, " +
//                "   name    varchar(10) not null, " +
//                "   birth   date        not null, " +
//                "   gender  int         not null, " +
//                "   email   varchar(50) not null, " +
//                "   hp      varchar(15) not null, " +
//                "   regdate datetime    default current_timestamp )";


//        회원정보 입력 받음
        Scanner sc = new Scanner(System.in);

        System.out.print("아이디 : ");
        String userid = sc.next();
        System.out.print("비밀번호 : ");
        String passwd = sc.next();
        System.out.print("이름 : ");
        String name = sc.next();
        System.out.print("생년월일(YYYY-MM-DD) : ");
        String birth = sc.next();
        System.out.print("성별(0:남, 1:여, 2:기타) : ");
        String gender = sc.next();
        System.out.print("본인확인 이메일 : ");
        String email = sc.next();
        System.out.print("휴대전화 : ");
        String hp = sc.next();

        String reg = " insert into NMember " +
                " ( userid, passwd, name, birth, gender, email, hp )" +
                " values (?, ?, ? ,? ,? ,? ,?) ";

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(reg)
                )
        {
            pstmt.setString(1, userid);
            pstmt.setString(2, passwd);
            pstmt.setString(3, name);
            pstmt.setString(4, birth);
            pstmt.setString(5, gender);
            pstmt.setString(6, email);
            pstmt.setString(7, hp);

            int cnt = pstmt.executeUpdate();
            if(cnt > 0) System.out.println("회원가입 성공");

        } catch (Exception ex) {
            ex.printStackTrace();
        }

//        조회 테스트
//        select mbno, uderid, name, regdate from NMember
//        order by mbno desc;

//        데이터 상세조회 테스트
//        select * from NMember where mbno = 1;

//        데이터 수정 테스트
//        update NMember set name = "전지현",
//        birth = "2020-04-21", hp = "010-6789-1234"
//        where mbno = 1;

//        데이터 삭제 테스트
//        delete from NMember
//          where mbno = 1;

//        회원가입 완료 후 지금까지 가입한 모든 회원 조회
//        조회 대상 컬럼: 회원번호, 아이디, 이름, 가입일

        String readsql =
                " select mbno, userid, name, regdate from NMember " +
                        " order by mbno desc; ";

        try (
                Connection conn = jdbc.openConn();
                PreparedStatement pstmt = conn.prepareStatement(readsql);
                ResultSet rs = pstmt.executeQuery();
            )
        {
            String fmt =
                    "%s, %s, %s, %s \n";
            StringBuffer sb = new StringBuffer();
            while (rs.next()) {
                String result = String.format(fmt,
                        rs.getString(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4).substring(0,10));
                sb.append(result);
            }
            System.out.println(sb.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }




    }   // main
}   // class


class Mariadb {
    private ResourceBundle rb = null;
    private String DRV;
    private String URL;
    private String USR;
    private String PWD;

    public Mariadb() {
        String pkpath = "sjk.basic.jdbc.jdbc";
//        nickname.basoc.jdbc : 패키지 경로
//        jdbc : properties 파일명
        rb = ResourceBundle.getBundle(pkpath);
        DRV = rb.getString("mdrv");
        URL = rb.getString("murl");
        USR = rb.getString("musr");
        PWD = rb.getString("mpwd");
    }

    public Connection openConn() {
        Connection conn = null;
        try {
            Class.forName(DRV);
            conn = DriverManager.getConnection(URL, USR, PWD);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return conn;


    }
}