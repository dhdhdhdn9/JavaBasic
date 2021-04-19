package sjk.basic.day14;

import java.util.Scanner;

public class EX07 {
    public static void main(String[] args) {

//        Qxx - 두 수를 입력받아 두 사이에 있는 모든 값의 총합을 구하는 코드를 작성하세요
//        ex) 10, 3 => 3, 4, 5, 6, 7, 8, 9, 10에 대한 총합
//        ex) 3, 10 => 3, 4, 5, 6, 7, 8, 9, 10에 대한 총합

        Scanner sc = new Scanner(System.in);

        System.out.println("연습 문제");

        System.out.print("첫번째 수 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 수 : ");
        int num2 = sc.nextInt();

        int sum = 0;
        if (num1 > num2)
            for(int k = num2; k <= num1; ++k)
                sum += k;
        else
            for(int k = num1; k <= num2; ++k)
                sum += k;

        String fmt = "%d하고 %d 사이 값들의 합 = %d";
        System.out.printf(fmt, num1, num2, sum);

        System.out.println("");
        System.out.println("가우스로 쓰기");

//        가우스 덧셈을 이용하면 간단히 계산 가능
//        단, j < i일 경우를 대비하여 절대값을 활용해야 함.
//        ( i + j) * (j - i + 1) / 2
//        i < j

        sum = (num1 + num2) * ( Math.abs(num2 - num1) + 1) / 2;
        System.out.println(sum);




    }
}
