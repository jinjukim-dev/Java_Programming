package ch4;

import java.util.Scanner;

public class FlowEx27 {

	public static void main(String[] args) {
		
		int num;
		int sum = 0;
		boolean flag = true; //while문의 조건식으로 사용될 변수
		
		System.out.println("합계를 구할 숫자를 입력하세요. (끝내려면 0을 입력)");
		
		while(flag) {
			System.out.print(">>");
			
			Scanner sc = new Scanner(System.in);
			String tmp = sc.nextLine();
			num = Integer.parseInt(tmp);
			
			if(num != 0) {
				sum += num;
			} else {
				flag = false; //num이 0이면 flag를 false로 바꿔서 while문 빠져나가기
			}
		}
		
		System.out.println("합계 : "+sum);

	}

}
