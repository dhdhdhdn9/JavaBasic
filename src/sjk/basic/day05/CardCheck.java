package sjk.basic.day05;

import java.util.Scanner;

public class CardCheck {

	public static void main(String[] args) {
		// 문자열.charat(자릿수) : 지정한 자릿수의 문자 하나 추출
		// 문자열.substring(시작, 끝) :
		//						지정한 시작 위치에서 끝-1위치의 문자들 추출

		// 33번 문제
		// 신용카드 번호의 첫글자를 보고
		// 어떤 종류와 은행인지 알려주는 프로그램
		// 3: JCB 카드
		// 4: Visa 카드
		// 5: Master 카드
		
			
		String cardno = "";
		String cardtype = "";
		String cardbank = "";
		String fmt = "카드 종류 : %s \n" + "카드 타입 : %s";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("카드번호 :  ");
		cardno = sc.next();
		
		// if (cardNo.charAt(0) == '3')
		//	cardtype = "JCB 카드";
		// else if (cardNo.charAt(0) == '4')
		//	cardtype = "Visa 카드";
		// else if (cardNo.charAt(0) == '5')
		//	cardtype = "Master 카드";
					
	
		
		switch(cardno.charAt(0)) {
			case '3' : cardtype = "JCB 카드"; break;
			case '4' : cardtype = "Visa 카드"; break;
			case '5' : cardtype = "Master 카드"; break;
		}
		
			
		// System.out.println(cardtype); 
		
		
		switch(cardno) {
			case "356317": cardbank = "NH농협카드"; break;
			case "356901": cardbank = "신한카드"; break;
			case "356912": cardbank = "KB국민카드"; break;
			case "404825": cardbank = "비씨카드"; break;
			case "438676": cardbank = "신한카드"; break;
			case "457973": cardbank = "군민은행"; break;
			case "515594": cardbank = "신한카드"; break;
			case "524353": cardbank = "외환카드"; break;
			case "540926": cardbank = "국민은행"; break;
		}
	
		System.out.printf(fmt, cardtype, cardbank); 
	
	
	}
}
