package sjk.basic.day05;

import java.util.Scanner;

// 성적 처리 프로그램 v2b
// 성적처리시 학점계산을 switch문으로 작성

public class SungjukV2b {
	public static void main(String[] args) {
		
				
		// 변수 선언
		String name;		
		int kor, eng, mat;
		int tot;
		double avg;		//%.1f
		char grd;		// %c
		String fmt = "%s, %d, %d, %d \n" +
					 "%d, %.1f, %c \n";
		
		Scanner sc = new Scanner(System.in);
		
		// 성적 처리
		
		int i = 1;
		while (i <= 3) {	// while문의 조건식을 true로 설정하면
							// 제한 없이 코드를 계속 실행함
				
					
			System.out.print("이름은?");
			name = sc.next();
			System.out.print("국어는?");
			kor = sc.nextInt();
			System.out.print("영어는?");
			eng = sc.nextInt();
			System.out.print("수학은?");
			mat = sc.nextInt();
			
			tot = kor + eng + mat;
			avg = (double)tot / 3;
			
			// 학점계산을 if문으로
			// grd = '가';
			// if (avg >= 90) grd = '수';
			// else if (avg >= 80) grd = '우';
			// else if (avg >= 70) grd = '미';
			// else if (avg >= 60) grd = '양';
			
			
			// 학점 계산을 switch문으로
			
			switch ((int)avg/10) { // 정수로 만든 후 10으로 나눔으로서 뒷자리 사라짐
			case 10: case 9: 
				grd = '수'; break;
			case 8:
				grd = '우'; break;
			case 7:
				grd = '미'; break;
			case 6:
				grd = '양'; break;
			default :				// 나머지는 default
				grd = '가';
				
			}
			
			
			

			
			// 결과 출력
			System.out.printf(fmt,
					name, kor, eng, mat, tot, avg, grd);
			
				// 반복 증감식
				++i;
						
			}	 //while 함수의 닫힘 괄호
			
			
			
				
		
		
		
		
		
		
		
		
	}
}
