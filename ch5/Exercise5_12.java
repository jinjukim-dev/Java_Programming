package ch5;

import java.util.Scanner;

public class Exercise5_12 {
	public static void main(String[] args) {
		String[][] words = {
				{"chair", "의자"},
				{"computer", "컴퓨터"},
				{"integer", "정수"}
		};
		
		int score = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			System.out.printf("Q%d. %s의 뜻은? ", i+1, words[i][0]);
			
			String tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답입니다!");
				score++;
			}else {
				System.out.printf("틀렸습니다. 정답은 %s입니다.%n", words[i][1]);
			}
		}
		System.out.println();
		System.out.println("전체 "+words.length+"문제 중 "+score+"문제 맟추셨습니다.");
	}

}
