package sjk.basic.day09;

public class Starcraft2 {

    public static void main(String[] args) {


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


interface Terran2 {
    void name();
    void hp();
    void pow();
    void mvspd();
    void mineral();
    void gas();
}

interface MarineAction {
    void attack();
    void move();
    void ability();
}

interface FirebatAction {
    void attack();
    void move();
    void ability();
}

class TerranAction implements Terran2 {

    @Override
    public void name() { }

    @Override
    public void hp() { }

    @Override
    public void pow() {  }

    @Override
    public void mvspd() { }

    @Override
    public void mineral() { }

    @Override
    public void gas() { }
}








