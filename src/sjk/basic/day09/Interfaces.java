package sjk.basic.day09;

public class Interfaces {
    public static void main(String[] args) {
        // 인터페이스
        // 객체지향 9프로그래밍 핵심은 추상화
        // 즉, 복잡한 자료, 모듈, 시스템으로부터
        // 핵심적인 개념 또는 기능을 간추리는 것을 의미
        // 이것을 이용해서 중복된 소스코드를 줄이고,
        // 느슨한 결합도를 유지할 수 있음.

        // 추상화라는 개념을 적정하고 효율적으로 사용할 수 있도록
        // 문법적으로 지원해주는 논리적 도구가 바로 인터페이스

        // 인터페이스란
        // 추상메서드와 상수만으로 구성된 클래스
        // 어떤 클래스를 만들 때 추상 메서드를 통해
        // 기본이 되는 틀을 제공하여 규칙에 맞게 코드를 짤 수 있게 함
        // 클래스와 달리 다중상속을 지원함

        // 인터페이스 작성 시 interface라는 예약어를 사용하고
        // 인터페이스를 구현하려면 implement 키워드 사용

        Cat3 c = new Cat3();
        c.cry();

        Murloc m = new Murloc();
        m.cry();

        Dog3 d = new Dog3();
        d.cry();

    }
}

    class Animal3 {
        protected int height;
        protected int weight;
    }

    //    public void setWeight(int weight) {
    //        this.weight = weight;
    //    }


    interface Animal3Action {
        public abstract void cry();
    }


    // 클래스의 기능에 해당하는 부분은
    // 인터페이스를 통해 구현하도록 작성


    class Cat3 extends Animal3 implements Animal3Action {
            @Override
            public void cry() {
                System.out.println("야옹~ 야옹~");
            }
        }

    class Murloc extends Animal3 implements Animal3Action {
        @Override
        public void cry() {
            System.out.println("아로로로로로로로롤~");
        }
    }

    class Dog3 extends Animal3 implements Animal3Action {
        @Override
        public void cry() {
            System.out.println("멍멍! 멍멍!");
        }
    }



