package ch5;

public class MultiArrEx3 {
	
	public static void main(String[] args) {
		
		int[][] m1 = {
				
				{1, 2, 3},
				{4, 5, 6}	
		};
		
		int[][] m2 = {
				
				{1, 2},
				{3, 4},
				{5, 6}			
		};
		
		final int ROW = m1.length; // m1 행의 길이 =2
		final int COL = m2[0].length; // m2 열의 길이 =2
		final int M2_ROW = m2.length; //m2 행의 길이 =3
		
		int[][] m3 = new int[ROW][COL];
		
		//행렬곱 m1 x m2 = m3
		for(int i=0; i<ROW; i++) { // i=0,1
			for(int j=0; j<COL; j++) { //j=0,1
				/*m3[i][j] = m1[i][0]*m2[0][j]
						+ m1[i][1]*m2[1][j]
						+ m1[i][2]*m2[2][j];*/
			for(int k=0; k<M2_ROW; k++)
				m3[i][j] += m1[i][k] + m2[k][j];
			}
		}
		
		//m3행렬 출력
		for(int i=0; i<ROW; i++) {
			for(int j=0; j<COL; j++) {
				System.out.printf("%3d ", m3[i][j]);
			}
			
			System.out.println();
		}
	}

}
