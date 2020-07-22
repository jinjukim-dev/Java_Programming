package ch4;

public class FlowEx33 {

	public static void main(String[] args) {
		
		Loop1 : for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if(j==5)
					break Loop1; // Loop1밖으로 빠져나감 2단에서 4까지만 출력됨
					//break; for문 j를 빠져나가서 2~9단까지 *4까지만 출력
					//continue; 5만 제외하고 출력
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
			System.out.println();
		}

	}

}
