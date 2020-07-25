package ch7;

public class BindingTest3 {
	public static void main(String[] args) {
		Parent4 p = new Child4();
		Child4 c = new Child4();
		
		
		System.out.println("p.x = "+p.x); //p.x = 100
		p.method();
		//x = 200
		//super.x = 100
		//this.x = 200
		
		System.out.println();
		
		System.out.println("c.x = "+c.x); //c.x = 200
		c.method();
		//x = 200
		//super.x = 100
		//this.x = 200
		
		
		
	}

}

class Parent4 {
	int x = 100;
	
	void method() {
		System.out.println("Parent4 Method");
	}
}

class Child4 extends Parent4{
	int x = 200;
	
	void method() {
		System.out.println("x = "+x); // this.x와 같다
		System.out.println("super.x = "+super.x);
		System.out.println("this.x = "+this.x);
	}
}