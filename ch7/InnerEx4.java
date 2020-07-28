package ch7;

class Outer{
	
	class InstanceInner{
		int iv = 100;
	}
	
	static class StaticInner{
		int iv = 200;
		static int cv = 300;
	}
	
	void myMethod() {
		class LocalInner{
			int iv = 400;
		}
	}
}

public class InnerEx4 {
	
	public static void main(String[] args) {
		Outer oc = new Outer();
		Outer.InstanceInner il = oc.new InstanceInner();
		
		System.out.println("il.iv : "+il.iv);
		System.out.println("Outer.StaticInner.cv : "+Outer.StaticInner.cv);
		
		//내부클래스에서 스태틱 클래스는 외부 클래스를 먼저 생성하지 않아도 된다.
		Outer.StaticInner si = new Outer.StaticInner();
		System.out.println("si.iv : "+si.iv);
	}

}
