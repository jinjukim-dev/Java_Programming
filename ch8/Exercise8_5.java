package ch8;

public class Exercise8_5 {
	static void method(boolean b) {
		try {
			System.out.println(1);
			if(b) throw new ArithmeticException(); //b == true -> ArithmeticException ->runtime
			System.out.println(2);
		} catch (RuntimeException e) { //RuntimeException의 자손 = ArithmeticException
			System.out.println(3);
			return; //메서드를 빠져나간다. (finally 실행후)
		} catch(Exception e) {
			System.out.println(4);
			return;
		} finally { //try - catch - finally
			System.out.println(5); //예외발생여부에 관계없이 항상 실행되는 문장
		}
		
		System.out.println(6);
	}
	public static void main(String[] args) {
		method(true);
		method(false);
	}
	
	/* 실행결과
	 * 1
	 * 3
	 * 5 -> method(true)
	 * 1
	 * 2
	 * 5 
	 * 6 -> method(false)
	 */

}
