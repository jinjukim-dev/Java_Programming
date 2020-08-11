package ch8;

public class Exercise8_6 {
	
	public static void main(String[] args) {
		try {
			method1(); //1
		} catch (Exception e) { 
			// 여기서 NullPointerException 처리해줄 catch블록이 없으므로 method2() 처리
			System.out.println(5);
		}
	}
	
	static void method1() {
		try {
			method2(); //2 
			//NullPointerException 처리해줄 catch블록이 없으므로 method2() 종료
			System.out.println(1);
		} catch (ArithmeticException e) {
			System.out.println(2);
		} finally {
			System.out.println(3); //그래도 finally 수행
		}
		
		System.out.println(4);
	}
	
	static void method2() { //3
		throw new NullPointerException(); //예외발생
	}

}
