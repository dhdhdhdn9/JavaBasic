package sjk.basic.day14;

import java.util.Arrays;
import java.util.Vector;

public class Vectors {
    public static void main(String[] args) {
//        vector
//        ArrayList와 동일한 내부 구조를 가지고 있다
//        => 동적 배열, 저장 순서 중요, 중복 데이터 허용
//        멀티스레드 환경에서 안전하게 객체를 추가하고 삭제할 수 있다
//        => 동기화 기능 지원
//        따라서, ArrayList는 동기화 옵션이 빠져있기 때문에 벡터에 비해 속도가 빠름

//        중요 메서드
//        add, get, set, remove

//        벡터 정의 및 데이터 추가
        Vector<String> names = new Vector<>();
//        List<String> names = new Vector<>();
        names.add("혜교");
        names.add("지현");
        names.add("수지");
        names.add(1, "아이유");

        Vector<Integer> nums =
                new Vector<>(Arrays.asList(1,2,3,4,5));
//        List<String> names = new Vector<>();
//        배열을 이용해서 동적배열을 초기화함

//        반복구문 for( A : B )
//        B에서 차례대로 객체를 꺼내서 A에다가 넣겠다는 의미.
//        언제까지? B에 더이상 꺼낼 객체가 없을 때 까지.
        for(String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("");

        for(Integer num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("");

//        벡터 크기 및 용량
        System.out.println(
                names.size() + "/" + names.capacity());
        System.out.println(
                nums.size() + "/" + nums.capacity());

//        벡터에 있는 특정 요소 출력
        System.out.println( names.get(1) );

//        벡터에 있는 요소 삭제
        names.remove(1);    // 두번째 요소 삭제
        names.clear();           // 모든 요소 삭제

//        벡터에 있는 특정 요소 수정
        nums.add(3, 10);
        nums.set(0, 100);               // 첫번째 요소 값을 100으로 수정
        System.out.println(
                nums.get(0) + "/" + nums.get(3));




    }
}
