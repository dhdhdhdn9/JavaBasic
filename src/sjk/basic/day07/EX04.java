package sjk.basic.day07;

import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {
        // 생년월일을 입력받아 나이 계산
        // 현재년도 - 생년년도
        // 생일이 지났으면 그대로 사용
        // 생일이 지나지 않았으면 -1
//        int byear, bmonth, bday;    //생년월일
//        int cyear, cmonth, cday;    //현재년월일
//
//        Scanner sc = new Scanner(System.in);
//        String fmt = "현재 : %d년 %d월 %d일 \n" +
//                     "생일 : %d년 %d월 %d일 \n" +
//                     "나이 : %d세 \n";
//
//        // 현재 년월일 설정
//        cyear = 2021;
//        cmonth = 3;
//        cday = 24;
//
//        // 생년월일 입력 받음
//        System.out.print("태어난 년도 : ");
//        byear = sc.nextInt();
//        System.out.print("태어난 월 : ");
//        bmonth = sc.nextInt();
//        System.out.print("태어난 일 : ");
//        bday = sc.nextInt();
//
//        // 나이 계산
//        int age = cyear - byear;            // 현재 년도 - 생일년도
//        if (cmonth > bmonth && cday > bday); // 생일 지남 여부 확임
//            age = age - 1;
//
//
//
//
//        System.out.printf(fmt, cyear, cmonth, cday,
//                           byear, bmonth, bday, age);



        // 잔돈 계산하는 프로그램
        // 지불요구금액 : 54320원
        // 지불액 : 10000원
        // 잔돈 : 45680원

//        Scanner sc = new Scanner(System.in);
//        String fmt = "사용 금액 : %d \n" +
//                     "지불 금액 : %d \n" +
//                     "잔돈 : %d \n" +
//                     "50000원 : %d \n" +
//                     "10000원 : %d \n" +
//                     "5000원 : %d \n" +
//                     "1000원 : %d \n" +
//                     "500원 : %d \n" +
//                     "100원 : %d \n" +
//                     "50원 : %d \n" +
//                     "10원 : %d \n";
//
//        int price, pay, change;
//        int w50000, w10000, w5000, w1000, w500, w100, w50, w10;
//
//        System.out.print("사용 금액 : ");
//        price = sc.nextInt();
//        System.out.print("지불 금액 : ");
//        pay = sc.nextInt();
//
//        change = pay - price;       // 67890
//                                    // 50000원 1장
//        w50000 = change / 50000;
//        // change = change - (50000 * w50000);
//        change = change % 50000;   //나머지값이 자동으로 계산됨.
//
//        w10000 = change / 10000;
//        // change = change - (10000 * w10000);
//        change = change % 10000;
//
//        w5000 = change / 5000;
//        // change = change - (5000 * w5000);
//        change = change % 5000;
//
//        w1000 = change / 1000;
//        // change = change - (1000 * w1000);
//        change = change % 1000;
//
//        w500 = change / 500;
//        // change = change - (500 * w500);
//        change = change % 500;
//
//        w100 = change / 100;
//        // change = change - (100 * w100);
//        change = change % 100;
//
//        w50 = change / 50;
//        // change = change - (50 * w50);
//        change = change % 50;
//
//        w10 = change / 10;
//
//        System.out.printf(fmt, price, pay, (pay-price),
//                            w50000, w10000, w5000, w1000,
//                            w500, w100, w50, w10);

        computeAge();
        computeChange();


    }

    // 메서드로 숨겨서 짧게 만들기
    public static void computeAge() {

        int byear, bmonth, bday;    //생년월일
        int cyear, cmonth, cday;    //현재년월일

        Scanner sc = new Scanner(System.in);
        String fmt = "현재 : %d년 %d월 %d일 \n" +
                "생일 : %d년 %d월 %d일 \n" +
                "나이 : %d세 \n";

        // 현재 년월일 설정
        cyear = 2021;
        cmonth = 3;
        cday = 24;

        // 생년월일 입력 받음
        System.out.print("태어난 년도 : ");
        byear = sc.nextInt();
        System.out.print("태어난 월 : ");
        bmonth = sc.nextInt();
        System.out.print("태어난 일 : ");
        bday = sc.nextInt();

        // 나이 계산
        int age = cyear - byear;            // 현재 년도 - 생일년도

        if (cmonth > bmonth)               // 생일 지남 여부 확임
            age = age + 1;
        else if (cmonth == bmonth && cday >= bday)
            age = age + 1;
        else
            age = age - 1;

        System.out.printf(fmt, cyear, cmonth, cday,
                byear, bmonth, bday, age);

    }

    public static void computeChange() {

        int price, pay, change;
        int[] wons = new int [8];   // []안에 있는 숫자는 종류의 갯수를 의미함
                                    // 변수 선언을 한번에 하는 셈
                                    // {0,0,0,0,0,0,0,0}; 이렇게 {} 안의 위치로 종류를 가늠해도 됨
        int[] notes = {50000, 10000, 5000, 1000, 500, 100, 50, 10}; // 위치값에 맞춰서
                                                                    // 숫자 적어냄

        String fmt = "사용 금액 : %d \n" +
                "지불 금액 : %d \n" +
                "잔돈 : %d \n" +
                "50000원 : %d \n" +
                "10000원 : %d \n" +
                "5000원 : %d \n" +
                "1000원 : %d \n" +
                "500원 : %d \n" +
                "100원 : %d \n" +
                "50원 : %d \n" +
                "10원 : %d \n";

        Scanner sc = new Scanner(System.in);

        System.out.print("사용 금액 : ");
        price = sc.nextInt();
        System.out.print("지불 금액 : ");
        pay = sc.nextInt();

        change = pay - price;

        for(int i = 0; i < wons.length; ++i) {  // i는 0에서부터 위에 정한 종류의 수까지
            wons[i] = change / notes[i];
            change = change % notes[i];         // notes의 종류는 달라지기 때문에 적어두기.
            }

        System.out.printf(fmt, price, pay, (pay-price),
                wons[0], wons[1], wons[2], wons[3],
                wons[4], wons[5], wons[6], wons[7]);

    }


}
