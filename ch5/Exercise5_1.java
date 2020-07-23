package ch5;

public class Exercise5_1 {
	
	public static void main(String[] args) {
		
		//5-1 잘못된것 고르기 - d e
		
		//a - 선언 ok
		//int[] arr[];
		
		//b
		//int[] arr = {1,2,3,};
		//해설 - 마지막의 쉼표는 있어도 상관없다고 한다
		
		//c - 올바르게 선언+초기화 ok
		//int[] arr = new int[5]
		
		//d
		//int[] arr = new int[5]{1,2,3,4,5};
		//해설 - 두 번째 대괄호[]에 숫자 넣으면 안된다. {}안의 데이터의 개수에 따라 자동적으로 결정되기 때문
		
		//e 
		//int arr[5];
		//해설 - 배여을을 선언할 때는 배열의 크기를 지정할 수 없다.
		
		//f - ok
		//int[] arr[] = new int[3][];
		
		
		//5-2 정답!
		//arr[3].lenghth = 2
	}

}
