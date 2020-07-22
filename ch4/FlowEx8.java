package ch4;

import java.util.Scanner;

public class FlowEx8 {
	
	public static void main(String[] args) {
		
		char gender;
		String regNo = "";
		
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 주민등록번호를 입력하세요.(000000-200000) > ");
		regNo = sc.nextLine();
		
		gender = regNo.charAt(7);
		
		switch (gender) {
		case '2': 
		case '4':
			switch (gender) {
			case '2':
				System.out.println("당신은 2000년 이전에 출생한 여자입니다.");
				break;
			case '4':
				System.out.println("당신은 2000년 이후에 출생한 여자입니다.");
				break;
			}
			break;
			
		case '1': case '3':
			System.out.println("당신은 남자입니다.");
			break;
		default:
			System.out.println("유효하지 않은 주민등록 번호 입니다.");
		}
	}

}
