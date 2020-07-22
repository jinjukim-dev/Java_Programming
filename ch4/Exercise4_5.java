package ch4;

//o
public class Exercise4_5 {
	
	public static void main(String[] args) {
		for(int i=0; i<=10; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----while문");
		
		int a = 0;
		while(a<=10) {
			
			int b = 0;
			while(b <= a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
			a++;
		}
	}
}
