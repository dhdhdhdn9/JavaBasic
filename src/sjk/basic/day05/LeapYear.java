package sjk.basic.day05;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// 27번 문제
		
		// 윤년 여부를 출력하는 프로그램
		// 지구의 공전주기와 자전주기의 불일치로 발생
		// 공전주기 : 365.24일
		// 자전주기 : 0.24일
		// 이 둘간의 오차 때문에 4년마다 하루를 추가하는 방법으로 오류를 보정
		// 조건 1 : 현재 연도가 4로 나눠 떨어지지만, 100으로는 나눠 떨어지지 않음
		// 조건 2 : 현재 연도가 400으로 나눠 떨어짐
		
		
		int year;
		String result = "";
						
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력 : ");
		year = sc.nextInt();
		
		// %는 나누고 남은 수를 알려줌
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0)
			result = "윤년";
		else 
			result = "평년";
		
			
		
		System.out.println(result);
		
		
		

	}

}
