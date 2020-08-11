package ch8;

public class Exercise8_7 {
	
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) System.exit(0); //수행중인 프로그램 즉시 종료로 finally블록도 수행 x
			System.out.println(2);
		} catch (RuntimeException r) {
			System.out.println(3);
			return;
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally {
			System.out.println(5);
		}
		
		System.out.println(6);
	}
	
	public static void main(String[] args) {
		method(true);
		method(false);
	}
	
	/*실행결과
	 * 1 -> method(true) 실행종료
	 * 1
	 * 2
	 * 5
	 */

}
