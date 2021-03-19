package sjk.basic.day03;

public class Loop {

 public static void main(String[] args) {

	 //반복문 loop

	 //프로그램 내에서 똑같은 명령을 지정한 횟수만큼 

	 //반복하여 수행하도록 작성하는 명령문

	 // 사용빈도가 높은 명령어들 중 하나

	 // for(횟수지정후 반복), while(특정 조건만족할때까지 반복)

	 //인사말 출력 v1 - 1번만 출력

	 System.out.println("Hello, World!!");

	 

	 //인사말 출력v2 - 3번만 출력

	 System.out.println("Hello, World!!");

	 System.out.println("Hello, World!!");

	 System.out.println("Hello, World!!");

	 

	 //인사말 출력v2.5 - 5번만 출력

	 System.out.println("Hello, World!!");

	 System.out.println("Hello, World!!");

	 System.out.println("Hello, World!!");

	 System.out.println("Hello, World!!");

	 System.out.println("Hello, World!!");

	 

	 //인사말 출력v3 - 대상변경후 5번 출력

	 // world -> java

	 System.out.println("Hello, java!!");

	 System.out.println("Hello, java!!");

	 System.out.println("Hello, java!!");

	 System.out.println("Hello, java!!");

	 System.out.println("Hello, java!!");

	 

	 // 반복횟수에 따라 코드를 복붙하기에 벚거롭고

	 // 반복하는 내용이 바뀌면 수정하기도 번거롭고 귀찮음

	 

	 // for문

	 // 초기식, 조건식, 증감식을 이용해서 특정코드를

	 // 지정한 횟수만큼 반복하도록 작성하는 명령문

	 // for(초기식;조건식;증감식) {

	 //    반복할 코드

	 //}

	 // ex) 1 ~ 10까지 정수출력 v1 - 반복문 사용x

	 System.out.println("1");

	 System.out.println("2");

	 System.out.println("3");

	 System.out.println("4");

	 System.out.println("5");

	 System.out.println("6");

	 System.out.println("7");

	 System.out.println("8");

	 System.out.println("9");

	 System.out.println("10");

	
	 

	 // ex) 1 ~ 10까지 정수출력 v2 - 반복문 사용o
	 
	 System.out.println(" ");

	 System.out.println("정수 출력");
	 
	 for(int i = 1; i <= 10; ++i) {

	 System.out.print(i + " ");

	 }


	 // ex) 1 ~ 50사이 홀수출력
	 
	 System.out.println(" ");
	 
	 System.out.println("홀수 출력");
	 
	 for(int i = 2; i <= 50; ++i) {
		 
	 System.out.print(i + " ");

 
	 }
	
	 
	 // ex) 1 ~ 50사이 짝수출력
	 
	 System.out.println(" ");
	 	 
	 System.out.println("짝수 출력");
	 
	 for(int i = 2; i <= 50; i += 2) {
		 
	 System.out.print(i + " ");
	 
	 }

	 
	 System.out.println(" ");
	 
	 // ex) 1 ~ 100사이 총합

		
	 System.out.println("1 ~ 100 사이 총합 출력");
	 
	 int sum = 0;
	 
	 for(int i = 1; i <= 100; ++i) {
		 	sum = sum + i; 	}
		 
	 System.out.print(sum);
	 
	 {
	 
		 
	 System.out.println(" ");
		 
	 System.out.println("가우스 덧셈 공식 이용한 합");
	 
	 int sum1 = 0;
	 
	 for (int i = 0; i <= 100; i++) {
		 sum1 += (i + 100 - (i - 1));
		 
		 sum1 = sum1 / 2;
		 
	 }
	 
	 System.out.println(sum);
		 
	 }
	 }
 
}
	 
	 
