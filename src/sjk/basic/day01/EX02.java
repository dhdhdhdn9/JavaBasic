package sjk.basic.day01;
/**
 * 
 * 
 * 연습문제
 *
 *
 */
public class EX02 {
	public static void main(String[] args) {
		
		//
		
		//변수선언
		int soju;
		int chick;
		int gwato;
		int buga;
		int alltot;
		int givenmon;
		int change;
		
		//처리
		soju = 2 * 3000;
		chick = 1 * 12000;
		gwato = 16200;
		buga = 1800;
		alltot = gwato + buga;
		givenmon = 50000;
		change = givenmon - alltot;
		
		//결과 출력
		System.out.println("[ 음식나라 ]");
		System.out.println("---------------------");
		System.out.print("소주	 2	");
		System.out.println(soju);
		System.out.print("너나치킨 1	");
		System.out.println(chick);
		System.out.println("---------------------");
		System.out.print("과세합계	");
		System.out.println(gwato);
		System.out.print("부가세		");
		System.out.println(buga);
		System.out.println("---------------------");
		System.out.print("총합계	 	");
		System.out.println(alltot);
		System.out.print("받은금액	");
		System.out.println(givenmon);
		System.out.print("잔돈		");
		System.out.println(change);
		System.out.println("---------------------");
		System.out.println("2014. 07. 07 14:35:24");
		
	}
}