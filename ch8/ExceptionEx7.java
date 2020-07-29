package ch8;

public class ExceptionEx7 {
	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0); //ArithmeticException 발생 -> 해당 인스턴스가 만들어짐
			System.out.println(4); //실행 x
		} catch (ArithmeticException ae) {
			if(ae instanceof ArithmeticException) //ok 
				System.out.println("true"); //실행
			System.out.println("ArithmeticException");
		} catch(Exception e) {
			System.out.println("Exception");
		}
		
		System.out.println(6);
	}

}
