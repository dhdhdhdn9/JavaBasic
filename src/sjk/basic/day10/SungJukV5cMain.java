package sjk.basic.day10;

import sjk.basic.sungjuk.SungJukService;
import sjk.basic.sungjuk.SungJukServiceImpl;
import sjk.basic.sungjuk.SungJukVO;

import java.util.Scanner;

public class SungJukV5cMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SungJukService sjsrv = new SungJukServiceImpl();
        // sjsrv는 인스턴스 변수이므로 객체마다 개별적으로 생성된다
        // 정적변수 만들어서 모든 객체가 이것을 공유하도록 변경해야함
        // singleton 패턴을 이용해서 단일 객체로만 생성되도록 제한

        SungJukService sjsrv = SungJukServiceImpl.getInstance();
        // singleton 패턴을 이용해서 객체 생성

        String menu = "";
        SungJukVO sj = null;    // 성적은 개개인마다 다르기 때문에 따로 담을 그릇이 필요함

        while(true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": sj = sjsrv.readSungJuk();
                          sjsrv.computeSungJuk(sj); break;
                case "2": break;
                case "3": sjsrv.printSungJuk(sj); break;
                case "4": break;
                case "5": break;
                case "0": System.exit(0); break;    // 종료
                default:
                System.out.println("잘못 입력하셨습니다.");
            }
        }
    }
}
