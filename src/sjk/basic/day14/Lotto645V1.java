package sjk.basic.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto645V1 {
    public static void main(String[] args) {
//        로또 645 프로그램 만들기
//        ArrayList를 이용해서 1~45 사이 임의의 6개 숫자 생성
//        중복은 허용하지 않음
//        Random - nextInt, remove
//        비복원 추출 - 한번 뽑은 것을 다시 뽑을 수 없음.

//        뽑은 결과값을 저장할 동적배열
        List<Integer> lotto = new ArrayList<>();


//        1~45숫자를 동적배열 초기화
        List<Integer> nums = new ArrayList<>();
        for(int i = 1; i <= 45; ++i) {
            nums.add(i);
        }

//        난수를 이용해서 총 6개의 숫자를 뽑음
        for(int i = 0; i < 6; ++i) {
            Random rnd = new Random();
            int idx = rnd.nextInt(45-i);
//            1~45 숫자가 들어있는 배열의 요소 위치값을 난수로 생성

            lotto.add(nums.get(idx));
//            위치값으로 숫자를 뽑아 동적배열에 저장
//            get: 인덱스(괄호 안에 있는 idx)에 대한 아이템을 nums로 출력한다는 의미
//            add: 괄호 안의 값을 lotto의 값에 집어넣는다는 의미
//            괄호안에 있는 값이 움직여서 빠지거나 넣거나 한다고 의미하면 됨.

            nums.remove(idx);
//            뽑은 숫자(괄호 안의 아이템)는 배열(num 배열)에서 제거함
        }

//        결과 출력
//        lotto의 값을 key에 집어넣겠다.
        for(Integer key : lotto) {
            System.out.print(key + " ");
        }


    }
}