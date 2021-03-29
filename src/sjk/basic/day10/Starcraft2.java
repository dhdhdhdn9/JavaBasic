package sjk.basic.day10;

public class Starcraft2 {

    //인터페이스 기반으로 스타크래프트 유닛을 정의함

    public static void main(String[] args) {
        SCV2 s = new SCV2();
        System.out.println("SCV 체럭: " + s.hp);

        s.attack();
        s.move();
        s.ability();

        Marine2 m = new Marine2();
        System.out.println("해병 체력: " + m.hp);

        m.attack();
        m.move();
        m.ability();

        Firebat2 f = new Firebat2();
        System.out.println("화염방사대 체력 : " + f.hp);

        f.attack();
        f.move();
        f.ability();



    }

}

class Terran2 { // 부모 클래스. 추상 메서드의 존재로 이름에 abstract 붙음
    protected String name;
    protected int hp;
    protected int pow;
    protected double mvspd;
    protected int mineral;
    protected int gas;

    public Terran2() {}

    public Terran2(String name, int hp, int pow,
                  double mvspd, int mineral, int gas) {
        this.name = name;
        this.hp = hp;
        this.pow = pow;
        this.mvspd = mvspd;
        this.mineral = mineral;
        this.gas = gas;
    }



}

// 회색표시는 '생략'해도 된다는 의미.
interface Action {
    abstract public void attack();
    abstract public void move();
    abstract public void ability();
}

class SCV2 extends Terran2 implements Action {

    final String fmtattack  = "융합절단기를 이용해서 대상에 %d의 피해를 주고 있습니다. \n";
    final String fmtmove  = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtabbilty  = "대상을 수리하는 중입니다. \n";

    // 기본 생성자
    public SCV2() {
        name = "건설로봇";
        hp = 45;
        pow = 0;
        mvspd = 2.81;
        mineral = 50;
        gas = 0;
    }

    // 생성자
    public SCV2(String name, int hp, int pow,
               double mvspd, int mineral, int gas) {
        super(name, hp, pow, mvspd, mineral, gas);
    }

    // 메서드 구현 (위에 쓴대로 3개)


    @Override
    public void attack() {
        System.out.printf(fmtattack, pow);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void ability() {
        System.out.printf(fmtabbilty);
    }
}

class Marine2 extends Terran2 implements Action {

    final String fmtattack  = "가우스 소총을 이용해서 대상에 %d의 피해를 주고 있습니다. \n";
    final String fmtmove  = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtabbilty  = "전투자극제 사용으로 이동속도는 50%%, 공격속도는 33%% 증가합니다.\n";

    public Marine2() {
        name = "해병";
        hp = 50;
        pow = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }

    public Marine2(String name, int hp, int pow,
                  double mvspd, int mineral, int gas) {
        super(name, hp, pow, mvspd, mineral, gas);
    }


    @Override
    public void attack() {
        System.out.printf(fmtattack, pow);
    }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd);
    }

    @Override
    public void ability() {
        System.out.printf(fmtabbilty);
    }
}


class Firebat2 extends Terran2 implements Action {

    final String fmtattack  = "화염방사기를 이용해서 대상에 %d의 피해를 주고 있습니다. \n";
    final String fmtmove  = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtabbilty  = "전투자극제 사용으로 이동속도는 50%%, 공격속도는 33%% 증가합니다. \n";

    public Firebat2() {
        name = "화염방사병";
        hp = 50;
        pow = 8 * 2;
        mvspd = 1.875;
        mineral = 50;
        gas = 25;
    }

    public Firebat2(String name, int hp, int pow,
                   double mvspd, int mineral, int gas) {
        super(name, hp, pow, mvspd, mineral, gas);
    }

    @Override
    public void attack() {
        System.out.printf(fmtattack, pow); }

    @Override
    public void move() {
        System.out.printf(fmtmove, mvspd); }

    @Override
    public void ability() {
        System.out.printf(fmtabbilty); }
}


