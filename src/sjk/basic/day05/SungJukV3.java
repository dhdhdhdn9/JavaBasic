package sjk.basic.day05;

import java.util.Scanner;

public class SungJukV3 {

	
	// 성적처리프로그램을 쳬계적으로 만들려고 함
	// 객체지향을 토대로  CRUD  제공하로돌 적송
	// 즉, 성적데이터를 입력/조회/수정/삭제 메쥬를 제공해서
	// 프로그램의 사용성 높임
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menu = "";
		
		// System.out.println("작업 선택 : ");
		// 뭘 입력해야 할지, 입력 시 어떤 기능이 실행되는지 알 수 없음
		
		// System.out.println("작업 선택 : ");
		// 뭘 입력해야 할지 알지만
		// 여전히 입력 시 어떤 기능이 실행되는지 알 수 없음
		
		while(true) {	//프로그램이 끝나기 전까지는 계속 반복할 것임
			String displaymenu =
					"==================== \n" +
					"성적 프로그램 v3 \n" +
					"==================== \n" +
					"1. 성적 데이터 입력 \n" +
					"2. 성적 데이터 조회 \n" +
					"3. 성적 데이터 상세조회 \n" +
					"4. 성적 데이터 수정 \n" +
					"5. 성적 데이터 삭제 \n" +
					"0. 프로그램 종료 \n" +
					"==================== \n" +
					"작업 선택 : " ;
			
			System.out.println(displaymenu);
					
			menu = sc.next();
			
			switch(menu) {
				case "1": System.out.println("성적 데이터 입력"); break;
				case "2": System.out.println("성적 데이터 조회"); break;
				case "3": System.out.println("성적 데이터 상세조회"); break;
				case "4": System.out.println("성적 데이터 수정"); break;
				case "5": System.out.println("성적 데이터 삭제"); break;
				case "0": System.exit(0); break; // 프로그램 종료
				default :
					System.out.println("입력이 잘못되었습니다.");
			}	// switch
		}	// while
		
		

	}	// main

}
