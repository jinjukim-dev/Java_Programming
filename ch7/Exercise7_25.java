package ch7;

class Outer {
	class Inner {
		int iv = 100;
	}
	
	static class Inner2{
		int iv = 200;
	}
}

public class Exercise7_25 {
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.Inner in = oc.new Inner();
		
		System.out.println(in.iv);
		
		Outer.Inner2 in2 = new Outer.Inner2();
		System.out.println(in2.iv);
		
	}

}
