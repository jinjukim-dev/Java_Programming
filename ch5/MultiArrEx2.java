package ch5;

import java.util.Scanner;

public class MultiArrEx2 {
	
	public static void main(String[] args) {
		
		final int SIZE = 5;
		int x=0, y = 0;
		int num = 0;
		
		int[][] bingo = new int[SIZE][SIZE]; //5x5 빙고판
		Scanner sc = new Scanner(System.in);
		
		//빙고판 셋팅
		
		//배열의 모든 요소를 1부터 SIZE*SIZE까지의 숫자로 초기화
		//빙고판에 1~ 25 숫자 넣기
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
			
				bingo[i][j] = i*SIZE +j+1;
			}
		}
		
		//배열에 저장된 값을 뒤섞는다. (shuffle)
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				x = (int)(Math.random() * SIZE);
				y = (int)(Math.random() * SIZE);
				
				int tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		//빙고 게임
		
		do {
			
			//셖긴 빙고판 보여주기
			for(int i=0; i<SIZE; i++) {
				for(int j=0; j<SIZE; j++)
					System.out.printf("%2d ", bingo[i][j]);
				System.out.println();
			}
			
			System.out.println();
			
			System.out.printf("1~%d의 숫자를 입력하세요. (종료:0)>", SIZE*SIZE);
			num = sc.nextInt();
			
			//입력한 숫자를 찾아서 0저장하기
			outer:
				for(int i=0; i<SIZE; i++) {
					for(int j=0; j<SIZE; j++) {
						if(bingo[i][j] == num) {
							bingo[i][j] = 0;
							break outer; // 이중 for문 밖으로 가기 다시 빙고 게임 지속
						}
					}
				}
			
		} while (num != 0);
		
		System.out.println("게임종료");
		
		
		
		
	}

}
