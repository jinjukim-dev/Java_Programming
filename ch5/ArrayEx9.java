package ch5;

import java.util.Arrays;

public class ArrayEx9 {
	
	public static void main(String[] args) {
		int[] code = {-4, -1, 3, 6, 11};
		int[] arr = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			int tmp = (int)(Math.random()* code.length); //(Math.random() * 5) = 0~4 중 랜덤
			arr[i] = code[tmp];
		}
		
		System.out.println(Arrays.toString(arr));
		
	}

}
