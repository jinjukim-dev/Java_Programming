package ch3;

public class Exercise3_9 {
	
	public static void main(String[] args) {
		
		char ch = 'A';
		
		boolean b = ('0' <=  ch && ch <= '9') || ('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z') 
				? true : false;
		
		System.out.println(b);
	}

}