package sjk.basic.day11;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Locale;

public class JavaString {
    public static void main(String[] args) {
        // String 클래스
        // java.lang 패키지에 포함된 클래스
        // 문자열을 표현할 때 c언어는 char 배열로 표현하지만
        // 자바에서는 String이라는 클래스로 사용한다.
        // String 객체는 한번 생성되면 그 값을 읽기만 가능하고 수정은 불가하다.
        // => 불변 객체 immutable object
        // String 객체값 비교시 equals 메서드 사용해야 함
        // chatAt, concat, indexOf, trim, length
        // toLowerCase, toUpperCase, split, substring

        // 자바에서 String 객체는 메모리를 재활용interning 한다.
        // 즉, 생성된 String 객체값을 String Pool에서 저장하는데
        // 그 다음에 생성한 String 객체값이 이전과 유사한 경우
        // String Pool에 이미 만들어둔 객체를 재활용한다
        String str1 = "Hello, World!!";
        // 힙 영역 내 상수풀에 생성

        String str2 = new String("Hello, World!!");
        // 힙 영역에 생성

        String str3 = "Hello, World!!";
        // 힙 영역 내 상수풀에 생성

        // 문자열 비교 시 == 연산자는 값의 동등을 비교하는 것이 아니라
        // 값이 저장된 위치를 비교한다. (참조값 비교)
        if (str1 == str2)
            System.out.println("str1과 str2는 저장 위치가 같음");

        if (str1 == str3)
            System.out.println("str1과 str3은 저장 위치가 같음");

        // 문자열 비교시 equals 메서드를 사용해야
        // 변수에 저장된 값을 비교한다.
        if (str1.equals(str2))
            System.out.println("str1과 str2는 값이 같음");

        if (str1.equals(str3))
            System.out.println("str1과 str3은 값이 같음");

        // charAt : 문자열의 특정 위치index에 있는 문자를 반환
        // index는 0부터 시작함
        String jumin = "123456-1234567";
        if (jumin.charAt(7) == '1')     // 8번째 문자 추출
            System.out.println("남자입니다.");

        // concat : 두 문자열을 하나로 이어 묶음
        // 문자열에 + 연산자를 사용하면 StringBuilder로 변환한 후
        // Append로 문자열을 더하고 toString으로 문자열로 변환
        // 따라서, 2개의 문자열을 합칠 때는 concat 사용
        // 2개가 초과할 경우 +로 합치는 것이 나을 수 있음
        String a = "Hello, ";
        String b = "World!!";
        System.out.println(a.concat(b));

        // indexOf : 특정 문자열이 처음 등장하는 위치를 알아냄
        // 문자열이 존재하지 않을 경우 -1을 반환
        // 보통 문자열 내에 특정문자가 포함되어 있는지 알아낼 때 사용
        String c = "Hello, World!!";
        System.out.println(c.indexOf("World"));

        String d = "abc123.jpg";
        System.out.println(d.indexOf("."));

        String e = "123412341234";
        System.out.println(e.indexOf("12"));
        System.out.println(e.indexOf("12", 3));
        // 시작위치를 재조정하기 위해 fromIndex 매개변수 사용
        System.out.println(e.indexOf("12", 7));

        System.out.println(e.lastIndexOf("12"));
        // 오른쪽을 기준으로, 왼쪽 방향으로 특정 문자열의 인덱스를 찾음

        // trim : 문자열 입력 시 쓸데없는 공백이 추가되는 경우
        //        그 공백을 제거할 때 사용
        String f = " abc123 ";
        System.out.println(
                "[" + f + "]/" + "[" + f.trim() + "]");

        String g = " 987 xyz ";
        System.out.println("[" + g.trim() + "]");
        // 단, 문자열 가운데에 있는 공백은 제거되지 않음
        // replace 메서드를 이용하면 가운데에 있는 공백도 제거 가능

        // length : 문자열의 길이(갯수)를 반환하는 메서드
        // 문자열의 실제 바이트수를 알아내려면 getByte 사용해야함
        System.out.println(a.length());
        System.out.println(c.length());
        System.out.println(e.length());

        String h = "안녕하세요, 자바!!";
        System.out.println(h.length());
        System.out.println(h.getBytes().length);
        // UTF-8에서 한글은 3byte로 인식;
        System.out.println(e.getBytes().length);

        // toLowerCase, toUpperChase : 대소문자 변환에 사용
        String i = "abcdef";
        String j = "ABCDEF";

        System.out.println(i.toUpperCase());
        System.out.println(j.toLowerCase());

        // split : 특정 문자를 기준으로 문자열을 잘라서 배열에 넣어주는 메서드
        //         즉, "" 안에 있는 것을 기준으로 잘라서 배열함.
        String k = "혜교 78 56 12";
        String[] datas = k.split(" ");
        for (int i2 = 0; i2 < datas.length; ++i2)
            System.out.print(datas[i2]);
        System.out.println("");

        // ex) hello, java!!라는 문자열에서 각 단어의 첫글자를
        // 대문자로 만드는 코드를 작성하시오.

        String l = "hello, java!";
        String[] words = l.split(" ");
        System.out.println(
                (words[0].charAt(0) + "").toUpperCase());
        System.out.println(
                (words[1].charAt(0) + "").toUpperCase());



        // replace : 특정 문자열을 다른 문자열로 바꾸는 메서드
        // replace (기존 문자, 바꿀 문자)
        System.out.println(
                h.replace("자바", "파이썬") );


        // 123412341234에서 12를 98로 변경
        System.out.println(
                e.replace("12", "98")
        );

        String m = "1234-4567-9812";    // -를 :으로 변경
        System.out.println(
                m.replace("-", ":")
        );


        // ex) hello, java!!라는 문자열에서 각 단어의 첫글자를
        // 대문자로 만드는 코드를 작성하시오.
        String word1 = (words[0].charAt(0) + "").toUpperCase();
        String word2 = (words[1].charAt(0) + "").toUpperCase();
        l = l.replace("h", word1);
        l = l.replace("j", word2);
        System.out.println(l);

        // substring : 문자열의 시작위치부터 끝위치-1까지 문자열을 추출하는 메서드
        // 형태 1. subString(시작)
        // 형태 2. subString(시작, 끝-1)

        // ex) 주민코드에서 생년월일을 추출
        System.out.println(
                jumin.substring(0,6));   // 0~5까지 문자 추출

        // ex) 주민코드에서 생년월일을 제외한 나머지를 추출
//        System.out.println(
//                jumin.substring(7,14));
        System.out.println(
                jumin.substring(7));

        // valueOf : 숫자를 문자형으로 변환할 시 사용하는 메서드
        int height = 123;
        System.out.println( height + "" );
        System.out.println( String.valueOf(height) );
        System.out.println( Integer.toString(height) );

        // format : c언어의 printf처럼 서식문자열을 이용해서 문자열을 생성하는 메서드
        // 반면, System.out.printf 메서드는 생성된 문자열을
        // 화면에 출력하는데 사용하는 메서드일 뿐이다.

        Date today = new Date();

        // 시간과 관련된 코드는 앞에 't'를 꼭 붙임.
        // 부등호는 변수 하나를 가지고 여러 변수값을 뽑아낼 수 있게 한다.

        String fmt = "%tY년 %<tm월 %<td일 %<tH시 %<tM분 %<tS초 \n";
        String result = String.format(fmt, today);
        System.out.println(result);

        // StringBuilder, StringBuffer
        // String 객체는 불변객체이므로
        // 새로운 문자열이 추가되면 기존 공간 대신
        // 새로운 공간을 생성한 후 추가한다. => 메모리 낭비 심함
        // StringBuilder나 StringBuffer를 이용하면
        // 기존 공간에 새로운 문자열을 바로 추가할 수 있으므로
        // 메모리를 절약할 수 있다.
        // 따라서, +를 이용해 문자열을 결합하는것보다
        // StringBuilder와 append를 이용하는 편이 더 나음

        StringBuilder sb = new StringBuilder();

        sb.append("Hello, ").append("World").append("!!");
        System.out.println( sb.toString() );


    }
}
