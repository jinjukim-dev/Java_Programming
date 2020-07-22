package ch4;

import java.util.Scanner;

public class FlowEx32 {
	
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("(1) ice-americano");
			System.out.println("(2) hot-latte");
			System.out.println("(3) ice-tea");
			System.out.println("원하는 메뉴(1~3)를 선택하세요. (종료:0) > ");
			
			String tmp = sc.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("프로그램을 종료합니다.");
				break; //while문 완전히 빠져나오기
				
			} else if(!(menu >= 1 && menu <=3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다. (종료는 0)");
				continue; //다시 while문 처음으로 
			}
			
			System.out.println("선택하신 메뉴는 "+menu+"입니다.");
			System.out.println();
		}

	}

}
