package ch6;

public class ReturnTest {
	
	int add(int a, int b) {
		return a+b;
	}
	
	void add(int a, int b, int[] result) {
		result[0] = a + b;
	}
	
	public static void main(String[] args) {
		 
		ReturnTest r = new ReturnTest();
		
		int result = r.add(3, 5);
		System.out.println(result); //8
		
		int[] result2 = {0};
		r.add(3, 5, result2); //result[0] = 8
		System.out.println(result2[0]); //8
	}

}
