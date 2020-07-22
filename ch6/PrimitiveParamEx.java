package ch6;

class Data {
	int x;
}

public class PrimitiveParamEx {
	
	static void change(int x) {
		x = 1000;
		System.out.println("change() : x = "+x);
	}
	
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = "+d.x); //10
		
		change(d.x); //1000
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x); //10
	}

}
