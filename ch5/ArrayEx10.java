package ch5;

public class ArrayEx10 {
	
	static void printArr(int[] numArr) {
		for(int i=0; i<numArr.length; i++)
			System.out.printf("%d", numArr[i]);
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		//1. 배열 초기화
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*10); //0~9 랜덤
		}
		
		//2. 배열 출력
		printArr(numArr);
		
		//3. 배열 정렬
		for(int i=0; i<numArr.length-1; i++) {
			boolean changed = false; //자리바꿈이 발생했는지를 체크
			
			for(int j=0; j<numArr.length-1; j++) {
				if(numArr[j] > numArr[j+1]) { //옆의 값이 작으면 서로 바꾼다.
					
					int tmp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = tmp;
					changed = true;
					
				}
			}
			
			if(!changed) break;
			
			//4. 배열 출력
			printArr(numArr);
		}
	}

}
