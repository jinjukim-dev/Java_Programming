package ch8;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int number = 100;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			//ArithmeticException 발생 : 정수 0으로 나누려 했기 때문에
			//result  = number / (int)(Math.random() * 10); // 100 / 0~9까지 랜덤 수 
			
			try {
				result = number / (int)(Math.random() * 10);
				System.out.println(result);
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException 발생");
			}
		}
	}

}
