package ch7;

public class SuperTest2 {
	
	public static void main(String[] args) {
		Child1 c = new Child1();
		c.method();
	}
}

//Parent class 
//int x = 10;

class Child1 extends Parent{
	int x=20;
	
	void method() {
		System.out.println("x = "+x); //20
		System.out.println("this.x = "+this.x); //20 = 자손 클래스에 선언된 멤버변수 x
		System.out.println("super.x = "+super.x); //10 = 조상 클래스에 선언된 멤버 변수 x
	}
}
