package sjk.basic.day06;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EX04 {
    public static void main(String[] args) {

        //Q12 checkBirth
        // 생년월일을 이용해서 나이를 계산하는 프로그램을 작성하여라. (MyAge)

        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("태어난 년도 : ");
        year = sc.nextInt();

        System.out.println("당신은 올해" + (2020 - year + 1) + "세입니다.");




        //Q16 checkChange
        // 고객에게 돌려줘야 하는 잔돈을 화폐단위로 계산하는 프로그램을 작성하시오.
        // 즉, 잔돈을 돌려주기 위해
        // 10원, 50원, 100원, 500원, 1000원, 5000원, 10000원, 50000원 등이
        // 몇 개 필요한지 계산하는 것이다. (Charge)

        int price;
        int mine;
        int change;
        int m10;
        int m50;
        int m100;
        int m500;
        int m1000;
        int m5000;
        int m10000;
        int m50000;

        change = price - mine;
        m50000 = change / 50000;
        m10000 = (change % 50000) / 10000;
        m5000 = (change % 10000) / 5000;
        m1000 = (change % 5000) / 1000;
        m500 = (change % 1000) / 500;
        m100 = (change % 500) / 100;
        m50 = (change % 100) / 50;
        m10 = (change % 50) / 10;


        System.out.println("내야하는 금액 : ");
        price = sc.nextInt()
        System.out.println("지불한 금액 : ");
        mine = sc.nextInt()

                //미완성



    }
}
