package sjk.basic.day06;

public class Breaks {
    public static void main(String[] args) {
        // 반복문 제어하기 break, continue
        // break : 반복문 실행을 중단하는 명령

        // ex) 1 ~ 100 까지의 총합을 구하는 프로그램 작성
        // 단, 총합이 500을 넘는 경우, 실행을 중단함

        int sum = 0;
        int i;

        for(i = 0; i <= 100; ++i) {
            sum += i;
            if (sum >= 500) break;
            // 부분합이 500 이상인 경우 반복실행을 중지
        }


        System.out.println("총합 : " + sum);
        System.out.println("중지지점 : " + i);

        // ex. 주사위의 눈이 6 나올 때까지
        // 굴려보는 프로그램을 작성하시오
        // 또한 6이 나올 때까지 굴린 횟수도 같이 출력하세요
        // Math.random() 과 break문을 사용

        int count = 0;
        int dice;

        while (true) {
            dice = (int)(Math.random()*6) +1; // 곱한 값은 최대값
                                              // 더한 값은 최소값
            ++count;
            System.out.print(dice + " ");
            if (dice==6) break;
        }





        System.out.println(
               ": 총 " + count + "번의 반복 끝에 " + "주사위 눈 " + dice + "이 나왔습니다");


    }

}
