package ch4;

public class Exercise4_10 {
	
	public static void main(String[] args) {
		int num = 12345;
		int sum = 0;
		
		while(num > 0) {
			sum += num % 10; //끝자리값 가져와서 sum에 더하고
			
			num = num / 10; //끝자리 떄기
		}
		
		System.out.println("sum = "+sum);	
		
	}

}
