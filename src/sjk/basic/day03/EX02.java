package sjk.basic.day03;

public class EX02 {
	public static void main(String[] args) {
		
		// 7.
		
		System.out.println("7번 문제");
		
		//가
		System.out.println(
				"가 : " + (3 + 4.5 * 2 + 27 / 8)
				);
		
		// 나
		boolean result = (
				true || false && (3 < 4) || !(5 == 7)
				);
		System.out.println("나 : " + result);
		
		// 다
		boolean result2 = (
				true || ((3 < 5) && (6 >= 2))
				);
		System.out.println("다 : " + result2);
		
		// 라
		// System.out.println(!true > 'A');
		System.out.println(
				"라: 잘못된 비교 대상으로 인해 오류가 발생합니다.");
		
		// 마
		// 단일문자를 수식에 사용하면
		// 자동으로 숫자형으로 바뀐다.
		// 숫자형으로 변환 시, ASCII 코드 값을 참조한다.
		// 0 = 48, A = 65, a = 97
		// Z = 90
		System.out.println(
				"마 : " + (7 % 4 + 3 - 2 / 6 * 'Z')
				);
		
		// 바
		// D = 68, M = 77
		System.out.println(
				"바 : " + ('D' + 1 + 'M' % 2 / 3)
				);
		
		//사
		System.out.println(
				"사 : " + (5.0 / 3 + 3 / 3));
		
		//아
		String result6 = (
				(53 % 21) < (45 / 18)) ? "  참입니다" : " 거짓입니다";
		System.out.println(
				"아 : (53 mod 21) < (45 / 18)은" + result6);
		
		// 자
		boolean result7 = (
				(4 < 6) || true && false || false && (2 > 3)
				);
		System.out.println(
				"자 : " + result7);
		
		//차
		System.out.println(
				"차 : " + (7 - (3 + 8 * 6 + 3) - (2 + 5 * 2))
				);
		
		
		// 8.
		
		System.out.println("8번 문제");
		
		System.out.println("May 13, 1988 fell on day number");
		
		// 특정 연도-1의 12월 31일 요일을 출력
		// 0: 일, 1:월, 2: 화, 3: 수, 4: 목, 5: 금, 6: 토
		System.out.println( 
				"1988년 12월 31일의 요일은 " +
				( (13 + (13 * 3 - 1) / 5 + 1988 % 100  
	            + 1988 % 100 / 4 + 1988 / 400
	            - 2 * (1988 / 100) ) % 7 + 7) % 7 
				+ "입니다");
		
		System.out.print( " Check out this line  ");
		
		System.out.println( " //hello there " + '9' + 7 );
		
		// H와 I 사이 산술연산자로 인해
		// H와 I가 숫자형으로 변환되어 연산이 수행됨
		System.out.print( 'H' + 'I' + " is " + 1 + "more example" );
		System.out.print( 'H' + 6.5 + 'I' + " is " + 1 + "more example" );
		
		// System.out.print( "Print both of us", "Me too" );
		// , 대신 +로 이어야함
		
		System.out.print( "Reverse " + 'I' + 'T' );
		
		System.out.print( "No! Here is" + 1 + "more example" );
		
		System.out.println( "Here is " + (10 * 10) ); // that’s 100 ;

		System.out.println( "Not x is " + true ); // that’s true.
		
		// System.out.print(  );
		// 출력할 대상이 지정되지 않았으므로 오류 발생
		
		// System.out.println;
		// 괄호가 필요함
		
		// System.out.print( "How about this one" ++ '?' + 'Huh?' );
		// +를 한개만
		
	}
	
}
