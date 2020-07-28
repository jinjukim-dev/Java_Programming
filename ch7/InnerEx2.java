package ch7;

public class InnerEx2 {
	
	class InstanceInner{}
	static class StaticInner {}
	
	InstanceInner iv = new InstanceInner();
	static StaticInner cv = new StaticInner();
	
	static void staticMethod() {
		StaticInner obj2 = new StaticInner();
		
		//스태틱 메서드에서 인스턴스 클래스를 접근하려면 객체생성으로 접근 가능
		//외부 클래스 먼저 생성해야한다.
		InnerEx2 outer = new InnerEx2();
		InstanceInner obj1 = outer.new InstanceInner();
		
	}
	
	void instanceMethod() {
		//인스턴스 메소드에서는 모두 접근 가능
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
	}
	
	void myMethod() {
		class LocalInner{}
		//지역 클래스는 선언된 내부에서만 접근 가능 / 외부 접근 x
		LocalInner lv = new LocalInner();
	}

}
