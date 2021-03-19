package sjk.basic.day04;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// 구구단 출력하기
		// ex. 7단을 출력하세요 v1
		
		System.out.println("7 x 1 = 7");
		System.out.println("7 x 2 = 14");
		System.out.println("7 x 3 = 21");
		System.out.println("7 x 4 = 28");
		System.out.println("7 x 5 = 35");
		System.out.println("7 x 6 = 42");
		System.out.println("7 x 7 = 49");
		System.out.println("7 x 8 = 56");
		System.out.println("7 x 9 = 63");
		System.out.println("-----for-----");
		
		// ex. 7단을 출력하세요 v2 - for
		
		for(int i = 1; i <= 9; ++i) {
			System.out.println("7 x " + i + " = " + (7 * i));
		}
		
		// ex. 7단을 출력하세요 v2 - while, printf
		
		System.out.println("-----whpf-----");
		
		String fmt = "7 x %d = %d \n";		//여기서 \n은 줄바꿈 문자.
		int i = 1;
		while (i <= 9) {
			System.out.printf(fmt, i, 7*i);
			
			++i;
			}
		
		
		// ex. 3단을 출력하세요 - while prinff
		
		System.out.println("----- -----");
		
		i = 1;
		fmt = "3 x %d = %2d \n";	// 위에 String 있으니 또 쓸 필요 없음
									// 자릿수 지정을 위해 %d의 d 앞에 바라는 자릿수 적음
		while (i <= 9) {
			System.out.printf(fmt, i, 3*i);
			
			++i;	
			}
		
		
		System.out.println("-----gugupro-----");
			
		// 구구단 프로그램 v1
		// 사용자로부터 숫자(1 - 9)를 하나 입력 받아
		// 구구단을 출력하는 프로그램 작성
		// scanner, while, prinf
								
		Scanner sc = new Scanner(System.in);
					
		System.out.println("출력할 구구단의 단을 입력하시오 : ");
		int dan = sc.nextInt();				// next 옆에는 입력받는 것에 따라 달라짐
											// 문자면 아무것도 없고, 숫자면 Int 적기
		i = 1;
		fmt = "%d x %d = %2d \n";
		while (i <= 9) {
			System.out.printf(fmt, dan, i, dan*i);
			
			++i;	
			}
		
		
		// 구구단 프로그램 v2
		// 단, 1~9 이외의 숫자나 문자를 입력받으면
		// "잘못 입력하셨습니다!"라는 메세지를 출력하도록 함
		
		System.out.print("출력할 구구단의 단을 입력하시오 : ");
		char dan2 = sc.next().charAt(0);
		// 입력받은 문자열 중 첫번째 글자만 뽑아서
		// char형 변수에 대입
		// 어떤 글자를 쓰던지 첫번째 글자만 받아들임
		// 현재 구구단 프로그램이 2개 시행되고 있기 때문에 (위에 먼저한 문제)
		// 처음에는 제대로된 숫자를 입력하고, 그 다음에 잘못된 값을 기입해야함.
		
		// 입력받은 문자의 ASCII 코드 값이 49~57인지 검사
		
		String result = 
				(dan2 >= 49 && dan2 <= 57) ? 
						"구구단 출력" : "잘못 입력하셨습니다!";
		
		System.out.println(result);
		
		
		// 구구단 프로그램 v3
		// 단, 1~9 이외의 숫자나 문자를 입력받으면
		// "잘못 입력하셨습니다!"라는 메세지를 출력하도록 함
		System.out.print("출력할 구구단의 단을 입력하시오 : ");
		String dan3 = sc.next();
		
		i = 1;
		
		try {
		while(i <= 9) {
			System.out.printf(fmt, dan3, i, 
					(Integer.parseInt(dan3)*i));	// Integer.parseInt 문자를 숫자로 바꿈
					++i;
					}
			
			} catch(Exception ex) {
				System.out.println("잘못 입력하셨습니다!");
				}
		// 예외처리코드를 이용해서
		// 프로그램 실행 중 오류발생 시
		// 제어를 catch 코드 쪽으로 넘김
		
		System.out.println("-----jumin-----");
		
		// ex. 주민번호를 이용해서 성별을 출력하는 코드를 작성
		// 123456 - 765432 에서 7이 성별을 나타내는 코드
		// 1: 1999년 이하 출생 남자
		// 2: 1999년 이하 출생 여자
		// 3: 2000년 이상 출생 남자
		// 4: 2000년 이상 출생 여자
		// charat를 이용
		
		
		String jumin = "132456 - 765432";
		
		char gender = jumin.charAt(7);	//보고자하는 자릿수를 charAt()의 괄호 안에 넣음
		
		result = (gender == '1') ? "1999 이하 출생 남자" :
				 (gender == '2') ? "1999 이하 출생 여자" :
				 (gender == '3') ? "2000 이하 출생 남자" : "2000 이하 출생 여자";
		
		System.out.println(result);
		
	}

}
