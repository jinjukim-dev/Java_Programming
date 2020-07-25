package ch7;

public class BindingTest {
	public static void main(String[] args) {
		
		Parent1 p = new Child2();
		Child2 c = new Child2();
		
		System.out.println("p.x = "+p.x);
		p.method();
		
		System.out.println("c.x = "+c.x);
		c.method();
		
		/*메서드의 경우 참조변수의 타입에 관계없이 항상 실제 인스턴스의 타입인
		Child2 클래스에 정의된 메서드가 호출되지만
		인스턴스변수인 x는 참조변수의 타입에 따라 달라진다.
		p는 참조변수의 타입 Parent로 p.x = 100
		c는 참조변수의 타입 Child로 c.x = 200
		메서드는 실제 인스턴스 타입 Child로 정의된 Child Method 출력 */
		
	}

}

class Parent1{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child2 extends Parent1{
	int x = 200;
	
	void method() {
		System.out.println("Child Method");
	};
}
