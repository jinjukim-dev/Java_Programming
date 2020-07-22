package ch6;


public class ReferenceParamEx {
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x); //10
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = "+d.x); //1000 참조형 매개변수는 값 변경가능
		
	}
	
	static void change(Data d) {
		d.x = 1000;
		System.out.println("change() : x = "+d.x);
	}
	

}
