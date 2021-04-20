package sjk.basic.day16;

import sjk.basic.sungjuk.SungJukServiceV3;
import sjk.basic.sungjuk.SungJukServiceV3Impl;

import java.util.Scanner;

public class SungJukV7Main {

//    성적 처리 프로그램 V7 - ArrayList + 텍스트기반스트림 + 직렬화
//    입력한 성적 데이터를 직렬화를 통해 텍스트 기반 파일에 저장
//    따라서, 프로그램 종료해도 입력했던 데이터는 그대로 유지됨
//    SungJukServiceV3
//    initSungJuk, saveSungJuk (파일처리/직렬화) 추가

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SungJukServiceV3 sjsrv =
                SungJukServiceV3Impl.getInstance();

        String menu = " ";
        while (true) {
            sjsrv.displayMenu();
            menu = sc.next();

            switch (menu) {
                case "1": sjsrv.newSungJuk(); break;
                case "2": sjsrv.showSungJuk(); break;
                case "3": sjsrv.showOneSungJuk(); break;
                case "4": sjsrv.modifySungJuk(); break;
                case "5": sjsrv.removeSungJuk(); break;
                case "0": sjsrv.saveSungJuk();
                            System.exit(0); break;    // 종료
                default:
                    System.out.println("잘못 입력하셨습니다.");


            }


        }
    }
}