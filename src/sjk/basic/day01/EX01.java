package sjk.basic.day01;
/**
 * 
 * 
 * 예제 실습
 *
 *
 */
public class EX01 {
	public static void main(String[] args) {
	// 1.
	System.out.println("*   *    **    ****   ****   *   *	   /////");
	System.out.println("*   *   *  *   *   *  *   *  *   *	 l o   o l");
	System.out.println("*****  *    *  ****   ****    * *	(l   ^   l)");
	System.out.println("*   *  ******  *   *  *   *    *	 l [___] l");
	System.out.println("*   *  *    *  *    * *    *   *	 l_______l");
	
	
	System.out.println("            +---+");
	System.out.println("            l   l");
	System.out.println("        +---+---+");
	System.out.println("        l   l   l");
	System.out.println("    +---+---+---+    /\\_/\\    ------");
	System.out.println("    l   l   l   l   ( ' ' )  / Hello \\");
	System.out.println("+---+---+---+---+   (  -  ) <  Junior l");
	System.out.println("l   l   l   l   l    l l l   \\ Coder!/");
	System.out.println("+---+---+---+---+   (__l__)    -----");
	
	
	
	// 3.
	int rate1;				// 확실히 가능
	// int 1stPlayer;		// 숫자로 시작하면 안됨
	//int myprogram.java	// 사용가능 기호는 _, $
	// int long;			// 자바 예약어를 변수로 선언
	int TimeLimit;			// 가능, 변수명은 소문자로 시작할 것
	int numberOfWindows;	// 확실히 가능
	
	
	
	// 4.
	// 표현식: expression
	// 계산이나 처리를 위해 작성하는 식을 의미
	// 수학에서 수식과 유사
	// 표현식의 중요한 특징은 평가evaluate
	// 즉 코드의 결과를 알아내는 과정을 의미
	int x, y, z, s, s0, v0, t, g;
	int result;
	x = 10;
	y = 20;
	z = 30;
	s0 = 5;
	v0 = 10;
	t = 15;
	g = 20;
	
	result = 3 * x;				// 3x
	System.out.print("3x = ");
	System.out.println(result);

	result = (3 * x) + y;		// 3x + y
	System.out.print("(3 * x) + y = ");
	System.out.println(result);

	System.out.print("(x + y) / 7 = ");
	System.out.println(( x + y ) / 7);

	System.out.print("(3 * x + y) / (z + 2) = ");
	System.out.println((3 * x + y) / (z + 2));
	
	System.out.print("s0 + v0 * t + (1/2) * g * t^2 = ");
	System.out.println(s0 + v0 * t + (1/2) * g * t^2);

	
	
	// 5.
	double number = (1/3) * 3;
	System.out.println("( 1/3 ) * 3 = " + number);
	// 예상값: 1, 실제값: 0.0
	// 정수 나누기 정수는 정수임
	
	int quotient = (7/3);
	System.out.println("(7/3) = " + quotient);
	
	int remainer = (7 % 3);
	System.out.println("7 % 3 = " + remainer);
	
	result = 11;
	result /= 2;
	System.out.println("result /= 2 = " + result);
	// 복합대입연산자
	// 산술연산자와 대입연산자를 합쳐놓은 연산자
	//  ex) a = a + 1 => a += 1
	
	
	// 6.
	double xx = 2.5;
	double yy = 2.5;
	int m = 18;
	int n = 4;

	double result2 = xx + n * yy - (xx + n) * yy;
	System.out.println(
			"xx + n * yy - (xx + n) * yy = " + result2);

	result2 = m / n + m % n;
	System.out.println(
			"m / n + m % n = " + result2);

	result2 = 5 * xx - n / 5;
	System.out.println(
			"5 * xx - n / 5 = " + result2);

	result2 = 1 - (1 - (1 - (1 -(1 - n))));
	System.out.println(
			"1 - (1 - (1 - (1 -(1 - n)))) = " + result2);

	
	
	
	}
}