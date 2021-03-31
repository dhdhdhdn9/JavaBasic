package sjk.basic.day12;

import java.util.ArrayList;

public class Generics {
    public static void main(String[] args) {
//        제네릭Generic
//        다양한 데이터 타입의 객체를 다루는 메서드나
//        컬렉션 클래스에 컴파일 시 타입체크(자료형 검사)를 해주는 기능
//        즉, 클래스에 사용할 타입의 정보를 동적으로 넘겨줄 수 있고
//        실행할 때run time 발생할 수 있는 타입 간 오류를
//        컴파일할 때compile time 발견할 수 있도록 해준다.
//        JDK 1.5부터 추가된 기능

//        보호 동물 3마리를 동물원에 넣어둡시다
        Lion lion1 = new Lion();
        Tiger tiger1 = new Tiger();
        Zebra zebra1 = new Zebra();

//        Object형으로 배열을 선언하면
//        어떤 데이터타입의 개체든지간에 모두 저장이 가능하다.
        Object[] zoo1 = new Object[3];     // Object는 모든 것의 조상
        zoo1[0] = lion1;
        zoo1[1] = tiger1;
        zoo1[2] = zebra1;

//        단, 배열에서 객체를 빼낼 때는 그 데이터 타입에 맞는 적절한 형변환이 필요함
        ( (Lion)zoo1[0] ).sayName();
        ( (Tiger)zoo1[1] ).sayName();
        ( (Zebra)zoo1[2] ).sayName();

//        배열에서 꺼낸 객체를 적절히 변환하려니 번거로운 탓에
//        하나의 타입으로 일관적으로 변환한 경우
//        => 오류가 발생했으나, 컴파일 시에는 알 수 없음
//        ( (Tiger)zoo1[0] ).sayName();
//        ( (Tiger)zoo1[1] ).sayName();
//        ( (Tiger)zoo1[2] ).sayName();


//        object 배열에 정수를 저장해보기
        Object[] numbers1 = new Object[5];
        numbers1[0] = 123;
        numbers1[1] = 456;
        numbers1[2] = 789;

//        적절한 형변환을 통해 수식의 결과가 잘 수행됨
        System.out.println(
                (int)numbers1[0] + (int)numbers1[1] + (int)numbers1[2] );

//        이번엔 object 배열에 문자열을 저장해보기
        Object[] numbers2 = new Object[5];
        numbers2[0] = "123";
        numbers2[1] = "456";
        numbers2[2] = "789";

//        적절한 형변환을 이용하면 연산이 잘 수행될까?
//        System.out.println(
//                (int)numbers2[0] + (int)numbers2[1] + (int)numbers2[2] );
//        오류 발생 => 비정상 형변환이 원인
//        그런데, 컴파일할 때는 아무런 오류가 없음

//        System.out.println(
//                Integer.parseInt(numbers2[0]) +
//                Integer.parseInt(numbers2[1]) +
//                Integer.parseInt(numbers2[2]);
//                오류 발생 => 비정상 형변환이 원인
//        컴파일할 때 잘못되었다고 오류를 띄워줌
//        Object타입은 바로 정수로 변환할 수 없기 때문

//        JDK1.5 이전에는 여러 타입을 사용하는 대부분의 클래스나
//        메서드에서 인수나 반환값으로 Object 타입을 사용했다.
//        이런 경우, 반환된 Object 객체를 다시 원한 타입으로 변환해야 하고
//        운이 나쁜 경우, 실행 시 오류가 발생할 수도 있었다.

        Object[] numbers3 = new Object[5];
        numbers3[0] = 123;
        numbers3[1] = "456";
        numbers3[2] = 789;

//        System.out.println(
//                (int)numbers3[0] + (int)numbers3[1] + (int)numbers3[2] );
//        컴파일할 때는 아무 오류 없다가 실행한 후에야 비로소 오류가 출력된다

//        JDK1.5에서 도입한 제네릭을 활용하면
//        컴파일할 때 타입이 정해지므로
//        타입 검사나 타입 변환과 같은 번거오룸이 사라진다.
//        <> 기호 안에 타입 변수를 지정해서 사용한다.

//        보호 동물 3마리를 동물원에 넣어둡시다
//        ArrayList<Lion> zoo2 = new ArrayList<Lion>();
        ArrayList<Lion> zoo2 = new ArrayList<>();
        ArrayList<Tiger> zoo3 = new ArrayList<>();
        ArrayList<Zebra> zoo4 = new ArrayList<>();

        zoo2.add(new Lion());
//        zoo2.add(new Tiger());
//        컴파일할 때 타입체크 가능 - zoo2에는 tiger 객체를 추가 못함

        Lion l = zoo2.get(0);
        zoo2.get(0).sayName();
//        동적배열에서 객체를 추출할 때도 객체변환이 필요없다.

//        동적 배열에 정수 및 문자열을 저장해보기
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(123);
        nums1.add(456);
        nums1.add(789);
        System.out.println(
                nums1.get(0) + nums1.get(1) + nums1.get(2));

//        nums2라는 배열변수에는 String타입 값만 저장할 수 있다.
        ArrayList<String> nums2 = new ArrayList<>();
        nums2.add("123");
        nums2.add("456");
        nums2.add("789");
//        nums2.add(123); => 오류 발생
//        System.out.println(
//                (int)nums2.get(0) + (int)nums2.get(1) + (int)nums2.get(2));
//        컴파일 할 때 타입 검사를 해서 바로 오류를 알려줌

        System.out.println( Integer.parseInt( nums2.get(0) )
                + Integer.parseInt( nums2.get(1) )
                + Integer.parseInt( nums2.get(2) ) );





    }
}

class Lion {
    public void sayName() {
        System.out.println("사자는 멸종위기 등급 'VU'입니다.");
    }
}
class Tiger {
    public void sayName() {
        System.out.println("호랑이는 멸종위기 등급 'EN'입니다.");
    }
}
class Zebra {
    public void sayName() {
        System.out.println("얼룩말은 멸종위기 등급 'EN'입니다.");
    }
}

