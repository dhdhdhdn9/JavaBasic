package sjk.basic.day09;

public class AbstractClass {
    public static void main(String[] args) {
        // 추상클래스
        // 추상메서드를 포함한 클래스
        // 추상메서드 : 불완전 메서드를 의미
        // 즉, 메서드 선언부만 존재하고, 몸체는 존재하지 않음
        // 불완전 메서드를 초함하는 불완전 클래스이기 때문에
        // 이 클래스는 객체화가 되지 않음

        // 상속관계에 있는 자식 클래스가
        // 부모클래스에 정의해 둔 메서드를 사용하지 않고
        // 재정의해서 사용하는 경우를 오버라이딩이라 했음

        // 이처럼, 부모클래스의 메서드가 필요 없다면
        // 메서드를 완전하게 정의하지 않고
        // 형태만 만들어놓고 자식 클래스들이 내용을 채우도록하면 어떻게 될까?

    }

}

abstract class Animal2 {
    protected String name;
    abstract public void cry(); // 'cry'에 대한 내용이 없어서 추상메서드



}

class Cat2 extends Animal2 {
    @Override
    public void cry() {
        System.out.println("야옹~ 야옹~");
    }
}

class Dog2 extends Animal2 {
    @Override
    public void cry() {
        System.out.println("멍멍! 멍멍!");
    }

}


