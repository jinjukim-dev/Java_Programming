package ch7;

public class BindingTest2 {
	public static void main(String[] args) {
		Parent3 p = new Child3();
		Child3 c = new Child3();
		
		System.out.println("p.x = "+p.x);
		p.method();
		
		System.out.println("c.x = "+c.x);
		c.method();
	}

}

		/*선택의 여지가 없기 떄문에 참조변수의 타입에 관계없이 
		조상의 멤버들 사용*/

class Parent3 {
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child3 extends Parent3{}
