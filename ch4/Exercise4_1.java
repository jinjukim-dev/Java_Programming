package ch4;

public class Exercise4_1 {
	
	public static void main(String[] args) {
		
		//4-1
		//1 o
		int x = 0;
		boolean flag = false;
		if(x > 10 && x <20) {
			flag = true;
		}
		
		//2 o
		char ch = '\t';
		if(!(ch == ' ' || ch == '\t')) {
			flag = true;
		}
		
		//3 o
		ch = 'x';  

		if(ch == 'x' || ch == 'X') {
			flag = true;
		}
		
		//4 o
		if('0' <= ch && ch <= '9') {
			flag = true;
		}
		
		//5 o
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
			flag = true;
		}
		
		//6
		int year = 2020;
		if( year%400 == 0 || year%4 == 0 && year%100 !=0) {
			flag = true;
		}
		
		//7 o
		boolean powerOn = false;
		
		if(powerOn == false) {
			flag = true;
		}
		
		//8 o
		String str = "yer";
		if(str.equals("yes")) {
			flag = true;
		}
		
		//4-2
		int sum = 0;
		for(int i=1; i<=20; i++) {
			if(i%2 == 0 || i%3 == 0)
				continue;
			sum += i;
		}
		
		System.out.println("총합은 "+sum);
		
		
	}

}
