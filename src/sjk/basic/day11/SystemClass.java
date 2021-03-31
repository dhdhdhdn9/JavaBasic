package sjk.basic.day11;

public class SystemClass {
    public static void main(String[] args) {
        // System 클래스
        // 표준입출력과 관련된 실행시스템과 관련된 필드와 메서드 제공
        // static으로 선언됨 = 객체 생성 필요 없음

        long start = System.currentTimeMillis();
        //타이머 시작

        double sum = 1;
        for(int i=1; i<100000000; ++i)
            sum *= i;
        System.out.println(sum);

        long end = System.currentTimeMillis();
        //타이머 끝

        System.out.println("소요 시간 : " + (end - start));


    }

}
