package sjk.basic.day07;

public class SungJukV4b {
    // 클래스의 종류
    // 1. VO/DTO : value object / data transfer object
    //              값만 저장하기 위해 사용하는 클래스
    //              주로 데이터베이스 테이블의 각 열과 연계해서 작성함
    // 2. Service : 비지니스 로직을 구성하는 클래스
    //              데이터 영속화(데이터 영구 저장) 전에 처리하는 코드들로 구성
    // 3. DAO : data access object
    //          데이터 영속화와 관련된 코드들로 구성된 클래스
    //          주로 데이터베이스를 사용해서 데이터를
    //          추가/조회/수정/삭제하는 기능을 작성


    public static void main(String[] args) {

        SungJuk sj = new SungJuk(
                "지현", 87, 56, 32);

        SungJukService sjsrv = new SungJukService();

        sjsrv.computeSungJuk(sj);

        sjsrv.printSungJuk(sj);


    }

    static class SungJuk {         // 값만 저장하는 클래스
        // 멤버변수
        private String name;
        private int kor;
        private int eng;
        private int mat;
        private int tot;
        private double avg;
        private char grd;

        // 생성자

        public SungJuk() {
        }

        public SungJuk(String name, int kor, int eng, int mat) {
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.mat = mat;
        }
    }   // static class

    static class SungJukService {          // 기능만 저장하는 클래스. 맨 마지막에 접혀야함. 접힐 때 얼마나 접히는지 확인하며 하기
        //성적 입력
        public SungJuk readSungJuk() {
            return null;
        }

        //성적처리
        public void computeSungJuk(SungJuk sj) {        //얘는 독립적인 것
            sj.tot = sj.kor + sj.eng + sj.mat;
            sj.avg = (double) sj.tot / 3;
            switch ((int) sj.avg / 10) {
                case 10: case 9: sj.grd = '수'; break;
                case 8: sj.grd = '우'; break;
                case 7: sj.grd = '미'; break;
                case 6: sj.grd = '양'; break;
                default: sj.grd = '가'; break;
            }
        }

        //결과출력
        public void printSungJuk(SungJuk sj) {          // 얘는 독립적인 것
            String fmt = "%s %d %d %d \n %d %.1f %c \n";
            System.out.printf(fmt, sj.name, sj.kor, sj.eng, sj.mat, sj.tot, sj.avg, sj.grd);
        }


    }   // static class SungJukService

}
