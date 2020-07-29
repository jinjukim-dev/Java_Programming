package ch8;

public class ExceptionEx5 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //예외 발생
			//예외발생으로 catch문으로 이동 
			System.out.println(4); // 출력 x
		} catch (Exception e) {
			//다시 실행
			System.out.println(5);
		}
		System.out.println(6);
	}

}
