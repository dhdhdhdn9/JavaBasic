package sjk.basic.day11;

import java.util.Scanner;

public class WrapperClass {
    public static void main(String[] args) {
        // Wrapper class
        // 프로그램에 따라 기본 자료형의 데이터를 참고자료형으로
        // 바꿔 취급해야할 때가 있다.
        // 메서드의 매개변수가 객체형을 요구하면 그에 따라 객체형을 사용해야 한다.
        // 기본자료형 변수를 참조자료형 변수로 변환하는 클래스를
        // 래퍼클래스라 한다.
        // int => Integer / double => Double
        // char => Character / boolean => Boolean

        int a = 123;
        Integer b = new Integer(a);
        // 박싱 : 기본자료형 변수를 참조자료형 변수로 변환하는 것

        System.out.println(a);
        System.out.println(b);
        // 박싱을 통해 클래스의 장점을 활용할 수 있는 변수로 변환됨

        Scanner sc = new Scanner(System.in);
        System.out.println("원하는 숫자 입력 : ");
        int number = Integer.parseInt(sc.next());
        // 문자 입력값을 정수로 변환함


        int c = b.intValue();
        // 언박싱: 참조자료형 변수를 기본자료형 변수로 변환

        Integer d = 456;    // new Integer 사용 안함
        // 자동 박싱 적용

        int e = d;          // intValue 사용 안함
        // 자동 언박싱 적용

        // 10진수로 2진수 변환하기
        // 4 => 100
        System.out.println(
                Integer.toBinaryString(4));

        // 두 수를 비교해서 수1이 수2에 비해 큰지, 같은지, 작은지를 출력
        // compareTo(수1, 수2)
        // 결과 : 1, 0, -1
        System.out.println(b.compareTo(d));

        System.out.println(Integer.compare(b,d));

    }
}
