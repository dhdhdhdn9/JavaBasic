package sjk.basic.day04;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {

		// 조건문
		// 일반적으로 프로그램의 실행순서는 순차적seqeunce이다
		// 아지만, 특수한 상황이 발생할 시 선택적으로 코드를
		// 실행해야 할 필요가 생기는데, 이 때 조건문을 사용한다.

		
		// if
		// 조건식의 결과가 true와 false일 때
		// 각각 주어진 명령문을 실행한다
		// if(조건식) { 	// 조건이 참일 때 코드 실행
		// else  			//조건이 거짓일 때 코드 실행
		// }
		
		
		// ex) 1~100 사이 정수 중 짝수를 출력하시오
		for(int i = 1; i <= 100; ++i) {
			if  (i % 2 == 0) 	// i가 짝수라면
				System.out.print(i + " ");
			} // for
			
		
		// ex) 1~100 사이 정수 중 짝수라면 "짝수입니다"를,
		//	   홀수면 "홀수입니다."라고 출력하시오
			
		for (int i = 0; i <=100; ++i) {
			if (i % 2 ==0)
				System.out.println(i + " = 짝수");
			else 
				System.out.println(i + " = 홀수");	
			}

		
		System.out.println("-----tax-----");
		
		// 사용자가 연봉salary과 결혼 여부isMarried(0/1)를 입력하면
		// 다음의 세금율에 의해 납부해야 할 세금tax을
		// 계산하는 프로그램을 작성하세요
		// 미혼인 경우 : 연봉 3000미만 - 10%, 연봉 3000 이상 - 25%
		// 결혼한 경우 : 연봉 6000미만 - 15%, 연봉 6000 이상 - 35%
		
		// 변수 선언
		int sal;
		int mar;
		double tax;
		String fmt = "연봉은 %d이고, 결혼여부는 %d일 때 \n 세금 납부액 : %.1f";
				
		Scanner sc = new Scanner(System.in);
			
		// 성적 처리
					
		System.out.print("연봉은?");
		sal = sc.nextInt();
		System.out.print("결혼 여부는?(미혼=0, 기혼=1)");
		mar = sc.nextInt();
		
		if (mar == 0)
			tax = (sal < 3000) ? (sal * 0.25) : (sal * 0.10);
		else
			tax = (sal < 6000) ? (sal * 0.35) : (sal * 0.15);
		
					
		// 결과 출력
		System.out.printf(fmt, tax);
								
						 //while 함수의 닫힘 괄호
			
		
		
	
	}
		
}


