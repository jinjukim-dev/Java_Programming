package ch5;

public class Exercise5_5 {
	public static void main(String[] args) {
		int[] ballArr = {1,2,3,4,5,6,7,8,9};
		int[] ball3 = new int[3];
		
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random()*ballArr.length); //0~9 랜덤
			int tmp = 0;
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
			
		}
		
		//ballArr의 앞에서 3개의 수를 배열 ball3로 복사하기
		
		/*for(int i=0; i<ball3.length; i++) {
			ball3[i] = ballArr[i];
		}*/
		
		//ballArr[0]에서 ball3[0]으로 3개의 데이터를 복사
		System.arraycopy(ballArr, 0, ball3, 0, 3);
		
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
			
	}

}
