/*package ch7;

public class InnerEx1 {
	
	//인스턴스 클래스
	class InstanceInner{
		int iv = 100;
		//static int cv = 100; 인스턴스 클래스에 클래스 변수 선언 x
		final static int CONST = 100; //fianl static은 상수로 허용
	}
	
	//static 클래스
	//내부 클래스에서 static 변수를 선언해야하는 경우 static class 사용
	static class StaticInner{
		int iv = 200;
		static int cv = 200;
	}
	
	//메소드
	void myMethod() {
		//지역클래스
		class LocalInner{
			int iv = 300;
			final static int CONST = 300;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstanceInner.CONST); //100
		System.out.println(StaticInner.cv); //200

	}

}
*/