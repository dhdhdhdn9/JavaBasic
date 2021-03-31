package sjk.basic.day12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) throws IOException {     // 예외 떠넘기기의 흔적

//        예외exception와 오류error
//        자바 프로그램 작성 시 문법에 맞지 않게 코드를 작성하면 컴파일 오류가 발생한다.
//        또한, 코드가 제대로 작성되었다 해도
//        실행 중에 예상치 못한 상황으로 인해 오류가 발생할 수 있다.

//        이처럼 프로그램 실행 중에 예상치 못한 상황으로
//        프로그램의 실행에 영향을 주는 것을 예외와 오류로 구분할 수 있다.

//        1. 오류
//        오류는 시스템 단계에서 프로그램에 심각한 문제를 야기하여 실행중인 프로그램을 종료시킨다.
//        ex) 네트워크 서버 중단, 메모리 및 자원 고갈, 서버 터짐
//        이러한 오류는 개발자가 코드로 처리할 수 없다.

//        2. 예외
//        오류와 마찬가지로 실행중인 프로그램을 강제종료시키지만
//        발생할 수 있는 상황을 예측해서 코드로 예방할 수 있다.
//        ex) 파일 경로 잘못 작성, 데이터값 잘못 입력

//        개발자는 예외 처리를 통해 예외 상황을 처리할 수 있도록
//        예외처리 코드를 작성할 수 있어야 한다.

//        예외처리 전 (1)
        System.out.println("프로그램 시작1");
        System.out.println("프로그램 끝1");

//        예외처리 전 (2)
        System.out.println("프로그램 시작2");

        int a = 10, b = 25;
        int c = a + b;
        System.out.println(c);

        System.out.println("프로그램 끝2");

//        예외처리 전(3)
//        System.out.println("프로그램 시작3");
//
//        int d = 10, e = 0;
//        int f = d / e;      // 오류 발생 지점
//        오류 발생으로 인해 이후 문장은 실행되지 않고 중단됨
//
//        System.out.println(f);
//
//        System.out.println("프로그램 끝3");

//        예외처린 구문
//        자바에서는 예외를 처리하기 위해
//        try - catch - finally 구문을 사용한다.
//        try {
//              예외가 발생할만한 코드들
//        } catch (예측한예외상황1) {
//              예외발생 시 실행할 코드
//        } catch (예측한예외상황2) {
//              예외발생 시 실행할 코드
//        }

//        예외처리(1)
        System.out.println("프로그램 시작4");

        try {
            int g = 10, i = 0;
            int j = g / i;          // 오류 발생 지점
            System.out.println(j);  // 이 코드는 실행되지 않음
        } catch (Exception ex) {
//            예외상황을 명확하게 지정하지 않음
            ex.printStackTrace();
        }

        System.out.println("프로그램 끝4");
        
//        ex) 1~9 사이 정수만 입력 받아 화면에 출력하는 프로그램 작성
//        정수가 아닌 다른 문자 입력 시 "잘못 입력하셨습니다!" 라고 출력
//        예외처리를 이용해서 코드를 작성

        System.out.println(" ");

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("정수 입력(1~9) : ");
            int num = sc.nextInt();
            if (num <= 9)
                System.out.println("결과: " + num);
            else
                System.out.println("1~9 외의 정수를 입력하셨습니다!");
        } catch (Exception ex2) {
            System.out.println("정수를 입력해주세요!");
        }

        System.out.println(" ");

//        예외의 종류

//        1. 실행형 예외unchecked exception
//        ☆명시적인 예외처리를 강제하지 않는다☆
//        '실행 시run time'에 예외가 발생한다.
//        Ex) ArithmeticException, ArrayIndexOutOfBoundsException,InputMismatchException

//        2. 일반 예외checked exception
//        ☆명시적인 예외처리를 반드시 강제한다☆
//        '컴파일 시compile time' 예외가 발생한다.
//        EX) IOException, ClassNotFoundException

//        ex) 임의의 성적 데이터(이름, 국어, 영어, 수학)를 입력받아
//        c:/Java/sungjuk.txt에 저장하는 프로그램 작성



//        FileWriter만으로도 할 수 있는 작업을 BufferedWriter까지 활용해야 하는 이유
//        => 성능의 문제
//        작은 데이터를 쓰는 경우에야 FileWriter만으로도 큰 문제가 없지만,
//        100K 내외 이상의 데이터를 써야 하는 경우에는 성능상으로 봤을 때
//        BufferedWriter를 함께 사용하는 것이 더 효율적.
//        약 버퍼가 없는 상태로 입출력을 주고 받는 경우라면,
//        입출력이 될때마다 매번 데이터를 처리하는 과정을 거쳐야 하므로
//        CPU 사용 횟수와 메모리 접근 횟수가 많아진다

//        방법
//        BufferedWriter 인스턴스를 하나 더 생성하고,
//        그 인스턴스의 인자로 FileWriter 인스턴스를 집어넣는다.

        String sjdata = "혜교 98 45 23";
        String fpath = "c:/Java/sungjuk.txt";

        try {
            FileWriter fw = new FileWriter(fpath);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sjdata);   // sjdata에 있는 문자를 bw가 가리키는 대상에 기록한다.
            bw.close();         // close 시켜주지 않으면, 작업도 완료되지 않는다.
            fw.close(); }
        catch (IOException e) {
            e.printStackTrace();
        }

//        예외처리 회피, 양도, 떠넘기기
//        메서드 선언부에 throws를 사용해서 해당 메서드에서 발생한 예외를 미리 명시하고
//        메서드를 호출한 상위 메서드에서 이것을 처리할 수 있도록 한다.
//        이를 통해 각 하위 메서드들에서 발생하는 예외들을 한 곳에 모아 처리할 수 있다.
//        또한, 메서드에 try-catch 문을 사용하지 않아도 된다는 장점이 있다.

        fpath = "c:/abc123/sungjuk.txt";

            FileWriter fw = new FileWriter(fpath);      // 예외를 메서드 시그니처에 추가
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(sjdata);
            bw.close();
            fw.close();

   }
}
