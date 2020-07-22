package ch6;

public class FactorialTest {
	
	static int factorial(int n) { // n = 4
		int result = 0;
		
		if(n==1) return 1;
		
		return n * factorial(n-1);
		
	}
	
	public static void main(String[] args) {
		int result  = factorial(4);
		
		System.out.println(result);
	}

}