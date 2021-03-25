package sjk.basic.day08;

import sjk.basic.day07.B;

public class DataHide {
    public static void main(String[] args) {
        // 캡슐화 capsulation
        // 사용자가 굳이 알 필요가 없는 정보는
        // 사용자로부터 숨겨야 하다는 개념
        // 최소한의 정보만으로 프로그램을
        // 쉽게 이해하고 사용할 수 있음

        // 접근 지정자
        // 클래스와 멤버변수, 메서드 선언 시
        // 정보 은닉 정도를 부여할 수 있음

        // 자바의 4가지 접근 지정자
        // private > default > protected > public

        A one = new A();    // 동일 패키지 내 클래스
        System.out.println(one.c);  // public 변수
        System.out.println(one.a);  // default 변수
       //  System.out.println(one.b);  // private 변수

        B two = new B();    // DataHide 사용할 땐 alt + Enter 눌러서 B 클래스 가져오기.
                            // 다른 패키지 내 클래스
        // System.out.println(two.d);  // default : 다른 패키지이므로
        // System.out.println(two.e);  // private
        System.out.println(two.f);  // public : 아무데서나 다 됨


    } // main

} //class

    class A {
        int a;          // default 접근 지정
        private int b;  // private 접근 지정
        public int c;   // public 접근 지정
    }



