package sjk.basic.day14;

import java.util.*;

public class Lotto645V2 {
    public static void main(String[] args) {
//        로또 645 프로그램 만들기
//        Set을 이용해서 1~45 사이 임의의 6개 숫자 생성
//        중복은 허용하지 않음
//        Random - nextInt, while

//        for (int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1;
//            System.out.print(key + " ");
//        }
//        중복 발생

//        for (int i = 1; i <= 6; ++i) {
//            int key = rnd.nextInt(45) + 1;
//            lotto.add(key);
//        }
//        for(Integer k : lotto)
//            System.out.print(k + " ");
//        while이 아닌 for를 사용하면 중복이 발생할 때마다 lotto 변수의 갯수가 하나씩 줄어듦

//      set은 중복을 허용하지 않음
        Set<Integer> lotto = new HashSet<>();

        while(lotto.size() < 6) {
            Random rnd = new Random();
            int key = rnd.nextInt(45) + 1;
            lotto.add(key);
        }
//        중복값이 나오지 않을 때까지 무한 반복
//        복원 추출

        for(Integer k : lotto)
            System.out.print(k + " ");


//        내 버전
//        int MINLOTTO = 1;
//        int MAXLOTTO = 45;

//        List<Integer> Llist
//                = new ArrayList<>();
//
//        while(Llist.size()<6) {
//            int lotto = rnd.nextInt(MAXLOTTO) + MINLOTTO;
//            Llist.add(lotto);
//            System.out.print(lotto + "");
//         if (!Llist.contains(lotto)) {
//             Llist.add(lotto);
//            }
//            Collections.sort(Llist);
//            System.out.println("");
//        }
//



    }
}
