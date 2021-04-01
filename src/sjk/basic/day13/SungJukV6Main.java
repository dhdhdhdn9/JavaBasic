package sjk.basic.day13;

import sjk.basic.sungjuk.SungJukServiceV2;
import sjk.basic.sungjuk.SungJukServiceV2Impl;

import java.util.Scanner;

public class SungJukV6Main {

//    성적 처리 프로그램 V6
//    동적배열을 이용해서 대량의 성적데이                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          터를 저장할 수 있게 함.
//    즉, 입력받은 성적 데이터는 동적배열에 저장하고
//    저장한 데이터들을 조회, 수정, 삭제할 수 있도록 함
//    SungJukServiceV2
//    (1)readSungJuk, (2)showSungJuk, (3)showOneSungJuk(하나만 골라서 보여줌),
//    (4)modifySungJuk, (5)removeSungJuk
//    computeSungJuk, displayMenu

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SungJukServiceV2 sjsrv = SungJukServiceV2Impl.getInstance();

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
                case "0": System.exit(0); break;    // 종료
                default:
                    System.out.println("잘못 입력하셨습니다.");


            }


        }
    }
}