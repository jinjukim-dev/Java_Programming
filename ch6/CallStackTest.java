package ch6;

public class CallStackTest {
	
	static void fistMethod() {
		secondMethod();
	}
	
	static void secondMethod() {
		System.out.println("--secondeMethod()--");
	}
	
	public static void main(String[] args) {
		
		fistMethod();
		
	}

}
