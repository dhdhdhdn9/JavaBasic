package sjk.basic.day09;

public class Phones {
    public static void main(String[] args) {

        NormalPhone n = new NormalPhone();
        n.docall();

        MP3Phone mp = new MP3Phone();
        mp.music();

        SmartPhone sp = new SmartPhone();
        sp.camera();

    }
}

interface PhoneInterface {
    void getcall();
    void docall();
}

interface MP3Interface {
    void music();
    void movie();
}

interface SmartInterface {
    void internet();
    void camera();
    void game();
}

class NormalPhone implements PhoneInterface {
    @Override
    public void getcall() {
        System.out.println("전화 받는 중...");
    }

    @Override
    public void docall() {
        System.out.println("전화 거는 중...");
    }
}

class MP3Phone
        implements PhoneInterface, MP3Interface {

    @Override
    public void getcall() { }
    @Override
    public void docall() { }

    @Override
    public void music() {
        System.out.println("음악을 재생합니다.");
    }
    @Override
    public void movie() {
        System.out.println("동영상을 재생합니다.");
    }
}

// 상속(extends): 부모 클래스가 가진 특성과 기능을 변화없이 받음
// 구현(implements): 부모 클래스가 정해준 틀에 맞춰 새롭게 작성
// 기능적으로 구현이 더 나음
// 따라서, 아래처럼 상속으로 짜는 것은 다소 세련되지 못함
class MP3Phone2 extends NormalPhone implements MP3Interface {
    @Override
    public void music() {}
    @Override
    public void movie() {}
}

class SmartPhone
        implements PhoneInterface, SmartInterface {
    @Override
    public void getcall() {}
    @Override
    public void docall() {}

    @Override
    public void internet() {
        System.out.println("인터넷을 연결합니다.");
    }
    @Override
    public void camera() {
        System.out.println("사진을 찍습니다.");
    }
    @Override
    public void game() {
        System.out.println("게임을 실행합니다.");
    }

}




