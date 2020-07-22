package ch3;

public class Exercise3_1 {
	
	public static void main(String[] args) {
		
		int x = 2;
		int y = 5;
		char c = 'A';
		
		System.out.println(1+ x << 33); // 25,769,803,776 X
		System.out.println(y >= 5 || x < 0 && x>2); //true O
		System.out.println(y += 10 - x++); // y = y+ 10 - x++ = 13 0
		System.out.println(x+=2); // x = x+2 = 4 X
		//false O
		//67 - 65 = 2 O
		//5 O
		//66 O
		//B O
		//66 X
		//A X
	}

}