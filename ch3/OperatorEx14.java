package ch3;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c1 = 'a';
		for(int i=0; i<26; i++) {
			System.out.print(c1++);
		}
		System.out.println();
		
		c1 = 'A';
		for(int i=0; i<26; i++) {
			System.out.print(c1++);
		}
		System.out.println();
								
		c1='0';
		for(int i=0; i<10; i++) {
			System.out.print(c1++);
		}
	}
}
