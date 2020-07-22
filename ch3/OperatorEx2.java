package ch3;

public class OperatorEx2 {
	
	static public void main(String[] args) {
		
		int i=5, j=0;
		
		j = i++; //대입 후 증가  i=6, j = 5
		System.out.println("j=i++; 실행 후, i="+i+", j="+j);
		
		i=5;
		j=0;
		
		j = ++i; //증가 후 대입 i=6, j=6
		System.out.println("j=++i; 실행 후, i="+i+", j="+j);
		
		int a=5, b=5;
		System.out.println(a++); //5
		System.out.println(++b); //6
		System.out.println("a = "+a+", b = "+b); //6,6
		
	}

}
