package ch7;

class Parent{
	int x = 100;
	
	Parent(){   //3
		this(200);
	}
	
	Parent(int x){    //4 x = 200
		super();
		this.x = x;  // int x = 200
	}
	
	int getX() {     //5 x = 200
		return x;
	}
}

class Child extends Parent{
	int x = 3000;
	
	Child(){         //1
		this(1000);
	}
	
	Child(int x){  //2 x=1000
		super();
		this.x = x;
	}
}

public class Exercise7_7 {
	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("x = "+c.getX());  //100
	}

}
