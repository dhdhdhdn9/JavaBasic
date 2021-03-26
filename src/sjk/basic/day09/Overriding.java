package sjk.basic.day09;

public class Overriding {
    public static void main(String[] args) {
        // 메서드 재정의 override
        // 기존에 있는 것을 수정해서 하나 만드는 것
        // 객체 지향 3개 개념 중 다형성에 해당
        // 상속 관계에 있는 상위 클래스 메서드를
        // 하위 클래스에서 같은 이름의 메서드로
        // 다시 작성하는 것을 의미.
        // 즉, 상속받은 메서드를 재정의해서 사용하는 것을 의미

        Cat c = new Cat();
        System.out.println( c.cry() );

        Dog d = new Dog();
        System.out.println( d.cry() );

        Animal a = new Animal();
        System.out.println(a.cry());

    }
}

class Animal {
    public String eat() {return "동물이 먹습니다.";}
    public String cry() {return "동물이 웁니다.";}
}

class Cat extends Animal {
    @Override   // 부모 클래스에 정의된 메서드 대신 자식 클래스에서 새로 작성됨
                // compiler의 주성분
    public String cry() {   // 부모 클래스에 있는 명령문을 조금 수정함
        return "야옹~ 야옹~";
    }
}

class Dog extends Animal {
    @Override
    public String cry() {
        return "멍멍! 멍멍!";
    }
}
