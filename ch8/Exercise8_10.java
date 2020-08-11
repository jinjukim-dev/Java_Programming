package ch8;

public class Exercise8_10 {
	
	public static void main(String[] args) {
		try {
			method1(); //1 ->NullPointerException 발생
			System.out.println(6);
		} catch (Exception e) { //모든 예외 처리
			System.out.println(7); //9
		}
	}
	
	static void method1() throws Exception{ //2
		try {
			method2(); //3
			System.out.println(1);
		} catch (NullPointerException e) {
			System.out.println(2); //6
			throw e; //8
		} catch(Exception e) {
			System.out.println(3);
		} finally {
			System.out.println(4); //7 예외가 처리되지 않았지만 finally블럭 수행
		}
		
		System.out.println(5);
	}
	
	static void method2() { //4
		throw new NullPointerException(); //5
	}
	
	/*실행결과
	 * 2
	 * 4
	 * 7
	 */

}
