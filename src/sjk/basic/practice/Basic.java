package sjk.basic.practice;

public class Basic {
    public static void main(String[] args) {


        BountyHunter bh = new BountyHunter();
        bh.hero();
        bh.atk();


    }
}

interface Action {
    void intro();
    void whenCrt();
    void hero();
    void death();
    void atk();
}

class DarkStat {
    String name;
    int hp;
    int dge;
    int spd;
    int crt;
    double poss = Math.random();
}


class BountyHunter extends DarkStat implements Action {

    public BountyHunter() {
        name = "현상금 사냥꾼";
        hp = 25;
        dge = 5;
        spd = 4;
        crt = 4;
    }

    @Override
    public void intro() {
        System.out.println("사냥의 전율... 그리고 약속된 대가.");
    }

    @Override
    public void whenCrt() {
        System.out.println("네놈의 약점이 어딘지 알고있다!");
    }

    @Override
    public void hero() {
        System.out.println("모든 것들은 피를 흘리지. 두고 봐.");
    }

    @Override
    public void death() {
        System.out.println("마지막 주사위를 던져보겠어…");
    }

    @Override
    public void atk() {
        System.out.println(
                "현상금 사냥꾼이 " + ((int)((poss) * (10 - 5 + 1) + 5)) + "의 피해를 주었습니다.");
    }

}

