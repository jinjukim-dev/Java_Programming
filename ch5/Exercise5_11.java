package ch5;

public class Exercise5_11 {
	
	public static void main(String[] args) {
		int[][] score = {              //[5][3]
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}, 
		};
		
		int[][] result = new int[score.length+1][score[0].length+1]; //[6][4]
		
		for(int i=0; i<score.length; i++) { //5 - 행 0~4
			
			for(int j=0; j<score[i].length; j++) {  //3
				result[i][j] = score[i][j];
				
				//행 합
				result[i][score[0].length] += score[i][j];
						
				//열 합
				result[score.length][j] += score[i][j];
				
				//모든 값의 합
				result[score.length][score[0].length] += score[i][j];
			}
		}
		
		for(int i=0; i<result.length; i++) {
			for(int j=0; j<result[i].length; j++) {
				System.out.printf("%4d", result[i][j]);
			}
			System.out.println();
		}
	}

}
