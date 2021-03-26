package sjk.basic.day09;

public class Starcraft {
    public static void main(String[] args) {

        // SCV s = new SCV();
        // SCV s = new SCV("SCV", 45, 5, 2.81, 50, 0);
        // SCV 유닛을 만들 때마다 초기값을 저장하는 것은 다소 번거로움.
        // 즉, 동일한 속성을 가진 유닛을 만들 때마다
        // 매개변수를 통해 객체를 만드는 것은 비효율적
        // 이런 경우, 생성자 내에서 초기값을 지정하는 것이 나음

        SCV s = new SCV();
        System.out.println("SCV 체럭: " + s.hp);

        s.attack();
        s.move();
        s.specialAbility();

        Marine m = new Marine();
        System.out.println("해병 체력: " + m.hp);

        m.attack();
        m.move();
        m.specialAbility();

        Firebat f = new Firebat();
        System.out.println("화염방사대 체력 : " + f.hp);

        f.attack();
        f.move();
        f.specialAbility();



    }

}

    abstract class Terran { // 부모 클래스. 추상 메서드의 존재로 이름에 abstract 붙음
        protected String name;
        protected int hp;
        protected int pow;
        protected double mvspd;
        protected int mineral;
        protected int gas;

        public Terran() {}

        public Terran(String name, int hp, int pow,
                      double mvspd, int mineral, int gas) {
            this.name = name;
            this.hp = hp;
            this.pow = pow;
            this.mvspd = mvspd;
            this.mineral = mineral;
            this.gas = gas;
        }

        // 아래 3개는 유닛마다 다르기 때문에 따로 추상 메서드를 만듦
        // 불안정함
        abstract public void attack();
        abstract public void move();
        abstract public void specialAbility();

    }

class SCV extends Terran {

    final String fmtattack  = "융합절단기를 이용해서 대상에 %d의 피해를 주고 있습니다. \n";
    final String fmtmove  = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtabbilty  = "대상을 수리하는 중입니다. \n";

        // 기본 생성자
        public SCV() {
            name = "건설로봇";
            hp = 45;
            pow = 0;
            mvspd = 2.81;
            mineral = 50;
            gas = 0;
        }

        // 생성자
        public SCV(String name, int hp, int pow,
                      double mvspd, int mineral, int gas) {
            super(name, hp, pow, mvspd, mineral, gas);
            }

        // 메서드 구현 (위에 쓴대로 3개)
        @Override
        public void attack() {
            // 추상메서드를 이용해서 부모클래스에 정의된
            // attack 메서드를 유짓에 맞게 재정의
            System.out.printf(fmtattack, pow);
        }

        @Override
        public void move() {
            System.out.printf(fmtmove, mvspd);
        }

        @Override
        public void specialAbility() {
            System.out.printf(fmtabbilty);
        }

    }



class Marine extends Terran {

    final String fmtattack  = "가우스 소총을 이용해서 대상에 %d의 피해를 주고 있습니다. \n";
    final String fmtmove  = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtabbilty  = "전투자극제 사용으로 이동속도는 50%%, 공격속도는 33%% 증가합니다.\n";

        public Marine() {
        name = "해병";
        hp = 50;
        pow = 30;
        mvspd = 2.95;
        mineral = 50;
        gas = 0;
    }

    public Marine(String name, int hp, int pow,
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
    public void specialAbility() {
        System.out.printf(fmtabbilty);
    }

 }


    class Firebat extends Terran {

    final String fmtattack  = "화염방사기를 이용해서 대상에 %d의 피해를 주고 있습니다. \n";
    final String fmtmove  = "지정한 위치로 %.2f 속도로 이동중입니다. \n";
    final String fmtabbilty  = "전투자극제 사용으로 이동속도는 50%%, 공격속도는 33%% 증가합니다. \n";

    public Firebat() {
        name = "화염방사병";
        hp = 50;
        pow = 8 * 2;
        mvspd = 1.875;
        mineral = 50;
        gas = 25;
    }

        public Firebat(String name, int hp, int pow,
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
        public void specialAbility() {
            System.out.printf(fmtabbilty);
        }

    }



