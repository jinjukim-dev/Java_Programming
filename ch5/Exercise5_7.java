package ch5;

import java.util.Scanner;

public class Exercise5_7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("거슬러 줄 금액을 입력하세요. > ");
		//문자열을 숫자로 변환한다. 입력한 값이 숫자가 아닐 경우 예외가 발생한다.
		int money = sc.nextInt();
		
		System.out.println("money="+money);
		
		int[] coinUnit = {500, 100, 50, 10};
		int[] coin 	   = {5, 5, 5, 5};
		
		for(int i=0; i<coinUnit.length; i++) {
			int coinNum = 0;
			
			//1
			coinNum = money / coinUnit[i];
			//2
			if(coin[i] < coinNum)
				coinNum = 5;
			
			coin[i] -= coinNum;
			
			//3
			money -= coinUnit[i] * coinNum;
			
			System.out.println(coinUnit[i]+"원: "+coinNum);
		}
		
		if(money > 0) {
			System.out.println("거스름돈이 부족합니다.");
			System.exit(0);
		}
		
		System.out.println("=남은 동전의 개수=");
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.println(coinUnit[i]+"원: "+coin[i]);
		}
	}

}
