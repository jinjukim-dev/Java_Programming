package exercise;

public class SortEx {
	
	static void printArr(int[] arr) {
		for(int i:arr)
			System.out.print(i+" ");
	}
	
	public static void main(String[] args) {
		
		int[] arr = {10, 3, 56, 11, 39, 89};
		
		System.out.print("정렬 전 : ");
		printArr(arr);
		
		System.out.println();
		
		//오름차순으로 정렬
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		
		System.out.print("정렬 후 : ");
		printArr(arr);
	}

}
