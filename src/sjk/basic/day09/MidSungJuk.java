package sjk.basic.day09;

public class MidSungJuk {
    protected String name;
    protected int kor;
    protected int eng;
    protected int mat;
    protected int tot;
    protected double avg;
    protected char grd;

    public MidSungJuk() {    }

    public MidSungJuk(String name, int kor, int eng,
                      int mat, int tot, double avg, char grd) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
        this.tot = tot;
        this.avg = avg;
        this.grd = grd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getTot() {
        return tot;
    }

    public void setTot(int tot) {
        this.tot = tot;
    }

    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }

    public void computeSungJuk(){
        tot = kor + mat + eng;
        avg = (double)tot / 3;
        switch((int)avg / 10){
            case 10: case 9: grd = '수'; break;
            case 8: grd='우'; break;
            case 7: grd='미'; break;
            case 6: grd='양'; break;
            default: grd='가'; break;
        }
    }

    // 성적처리코드를 기능별로 짬
    // 부모
    public void getTotal(){
        tot = kor+ eng + mat;
    }

    public void getMean(){
        avg = (double)tot / 3;
    }

}

class FinalSungJuk extends MidSungJuk {
    private int soc;
    private int sci;


    public FinalSungJuk() {}

    public FinalSungJuk(String name, int kor, int eng,
                        int mat, int tot, double avg,
                        char grd, int soc, int sci) {
        super(name, kor, eng, mat, tot, avg, grd);
        // 부모 클래스의 생성자를 이용해서 기본 변수들을 초기화함
        // super : 부모클래스 자체를 의미하는 키워드드
        this.soc = soc;
        this.sci = sci;
    }



    @Override
    public void computeSungJuk() {
        // setTot(getKor() + getEng() + getMat() + soc + sci);
        // 부모 클래스의 멤버변수 접근지정자가
        // private로 선언되는 경우 원칙적으로 접근 불가
        // 따라서, setter/getter를 이용해서 코드완성
        // 코드가 다소 지저분해지는 단점 존재

        tot = kor+ eng + mat + soc + sci;
        // 부모 클래스의 멤버변수 접근지정자가
        // protected로 선언된 경우 접근 가능
        // 기존 수정없이 그대로 사용 가능

        avg = (double)tot / 5;
        switch((int)avg / 10){
            case 10: case 9: grd = '수'; break;
            case 8: grd='우'; break;
            case 7: grd='미'; break;
            case 6: grd='양'; break;
            default: grd='가'; break;
        }
    }


    public void getGrade(){
        switch((int)avg / 10){
            case 10: case 9: grd = '수'; break;
            case 8: grd='우'; break;
            case 7: grd='미'; break;
            case 6: grd='양'; break;
            default: grd='가'; break;
            }
    }


    // 기능별로 모듈화를 적용하는 경우
    // 상속관계에서 메서드 재정의 시
    // 편리하게 코드를 작성할 수 있음

    @Override
    public void getTotal() {
        tot = super.getTot();   //getTot는 3개를 더한 것
        tot = tot + soc + sci;
    }

    @Override
    public void getMean() {
        avg = (double)tot / 5;
    }
}

