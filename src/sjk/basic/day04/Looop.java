package sjk.basic.day04;

public class Looop {
	public static void main(String[] args) {
		
		// while
		// 특정조건을 만족할 때까지 계속해서 주어진 명령을 수행
		// 초기식
		// while(조건식) {
		//		반복코드
		//		증감식
		// }
		
		// 조건식이 처음부터 false면
		// while은 코드를 반복실행하지 않음
		// 반면, do-while문은 일단 코드를 먼저 실행하고 
		// 조건을 검사하기 때문에 조건식이 false라도
		// 최소 한 번 정도는 코드를 실행할 수 있음
		
		
		// ex) 1~10까지 정수 출력
		
		int i = 1; 			// 초기식
		while(i <= 10) {	// 조건이 참이면 반복실행
			System.out.print(i + " ");
			
			i += 1;			// 증감식
			}				// i에 1을 더하고, 그 결과를 왼쪽 변수에 할당
							// 즉, i = i + 1
			
		
		// ex) 1~50까지 홀수 출력
		
		System.out.println(" ");
		System.out.println("홀수 출력");
		
		i = 1; //초기화용
		while (i <= 50) {
			System.out.print(i + " ");
			
			i += 2;
			}
			
		
		// ex) 1~50까지 짝수 출력
		
		System.out.println(" ");
		System.out.println("짝수 출력");
		i = 2;
		while (i <= 50) {
			System.out.print(i + " ");
			
			i += 2;
			}
			
				
		
		// ex) 1~100사이 총합 출력
		
		System.out.println(" ");
		System.out.println("1~100 사이 총합");
		
		i = 1;
		int sum = 0;
		while (i <= 100) {		// i가 100보다 작으면
			sum += i; // i를 누적해서 더해라
			++i;	  // 피연산자를 1씩 증가시키는 것.
					  // 즉, i = i+1이므로 i는 1씩 증가한다.		
		}
		
		System.out.print(sum);
		
		// 가우스 덧셈공식을 이용하면
		// 특정범위 내 모든 수의 합을 편리하게 구할 수 있다
		// 총합: sum, 시작범위: i, 끝범위: j
		// sum = ((i + j) * j) / 2
		
		System.out.println(" ");
		System.out.println("1~100 사이 총합을 가우스로");

		i = 1;
		int j = 100;
		sum = ((i + j) * j) / 2;
		System.out.print(sum);
	
	
		
		// ex) 1 ~ 99 사이 총합
		// 가우스 공식 이용
		
		System.out.println(" ");
		System.out.println("1~99 사이 총합을 가우스로");
		
		i = 1;
		j = 99;
		sum = ((i + j) * j) / 2; 
		System.out.println(sum);
	
		
		
	}
	
	
	
	
}


