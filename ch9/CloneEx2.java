package ch9;

import java.util.Arrays;

public class CloneEx2 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		//배열 arr을 복제해서 같은 내용의 새로운 배열을 만든다.
		int[] arrClone = arr.clone();
		arrClone[0] = 6;
		
		//arraycopy이용시
		int[] arrCopy = new int[arr.length];
		System.arraycopy(arr, 0, arrCopy, 0, arr.length);
		
		System.out.println(Arrays.toString(arrClone));
		System.out.println(Arrays.toString(arrCopy));
	}
}
