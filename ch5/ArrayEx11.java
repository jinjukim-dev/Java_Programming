package ch5;

public class ArrayEx11 {
	
	public static void main(String[] args) {
		int [] numArr = new int[10];
		int [] counter = new int[10];
		
		for(int i=0; i<numArr.length; i++) {
			numArr[i] = (int)(Math.random()*9); //0~9
			System.out.print(numArr[i]);
		}
		System.out.println();
		
		for(int i=0; i<numArr.length; i++) {
			counter[numArr[i]]++;
			
		}
		
		for(int i=0; i<numArr.length; i++) {
			System.out.printf("%d의 개수 : %d%n", i, counter[i]);
		}
	}

}
