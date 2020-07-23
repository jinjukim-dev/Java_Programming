package ch7;

public class PointTest2 {
	
	public static void main(String[] args) {
		Point3D2 p3 = new Point3D2();
		// 7. x=100, y=200, z=300
		System.out.println("p3.x = "+p3.x);
		System.out.println("p3.y = "+p3.y); 
		System.out.println("p3.z = "+p3.z); 
	}
 
}

class Point2{
	int x=10;
	int y=20;
	
	// 1. x=10; y=10; z=0;
	
	Point2(int x, int y){
		// 4. x=100; y=200;
		this.x = x;
		this.y = y;
	}
}

class Point3D2 extends Point2{ 
	int z=30;
	// 2. x=10; y=10; z=30;
	
	Point3D2() {
		this(100, 200, 300);
		// Point3D2(int x, int y, int z) 호출
	}
	
	Point3D2(int x, int y, int z){
		// 3. x=100; y=200; z=300;
		
		super(x, y);
		// Point(int x, int y)로 
		// 5. x=100; y=200
		this.z = z;
		//z = 300
		// 6. x=100; y=200; z=300
	}
	
	
}
