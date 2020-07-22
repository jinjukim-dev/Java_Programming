package ch6;

public class StaticBlockTest {

	//클래스 변수 arr - 명시적 초기화
	static int[] arr = new int[10];
	
	//클래스 초기화 블럭
	//복잡한 초기화 이용시 초기화 블럭 사용하기
	static {
		for(int i=0; i<arr.length; i++)
			arr[i] = (int)(Math.random()*10)+1;
	}
	
	public static void main(String[] args) {
		for(int i=0; i<arr.length; i++)
			System.out.printf("arr[%d] : %d%n", i, arr[i] );
	}
}
