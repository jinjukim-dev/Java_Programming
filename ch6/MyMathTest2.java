package ch6;

class MyMath2 {
	
	//인스턴스 변수
	long a, b;
	
	//인스턴스 변수 a, b만을 이용해서 작업하므로 매개변수가 필요없다.
	//a,b는 인스턴스 변수
	//인스턴스 메서드
	long add() {return a + b;}
	long subtract() {return a - b;}
	long multiply() {return a*b;}
	double divide() {return a/b;}
	
	//인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
	//a, b는 지역변수
	//클래스 메서드
	static long addClass(long a, long b) {return a+b;}
	static long subtrack(long a, long b) {return a-b;}
	static long multiply(long a, long b) {return a*b;}
	static double divide(double a, double b) {return a/b;}
	
}

public class MyMathTest2 {
	
	public static void main(String[] args) {
		
		System.out.println("인스턴스변수 사용 - 객체 생성 후 사용 가능");
		//인스턴스 생성
		MyMath2 mm = new MyMath2();
		mm.a = 400L;
		mm.b = 200L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
		System.out.println("==========================");
		
		//클래스 메서드 호출. 인스턴스 생성없이 호출 가능
		//객체를 생성하지 않고도 메서드를 호출할 수 있으려면 메서드 앞에 static
		System.out.println("지역변수 사용  - 객체 생성없이 사용 가능");
		System.out.println(MyMath2.addClass(200L, 100L));
		System.out.println(MyMath2.subtrack(200L, 100L));
		System.out.println(MyMath2.multiply(200L, 100L));
		System.out.println(MyMath2.divide(200d, 100d));
		
	}

}
