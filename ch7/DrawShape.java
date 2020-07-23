package ch7;

class Shape{
	String color = "black";
	void draw() {
		System.out.printf("[color=%s]%n", color);
	}
}

class PointD{
	int x;
	int y;
	
	PointD(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	PointD() {
		this(0, 0);
	}
	
	String getXY() {
		return "("+x+","+y+")"; //x,y 문자열로 반환
	}
	
	String getLocation() {
		return "x : "+x+" y : "+y;
	}
	
}

class Circle extends Shape{
	Point center; //원의 원점 좌표
	int r;		  //반지름
	
	Circle() {
		this(new Point(0, 0), 100); // Circle(Point center, int r) 호출
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center=(%d, %d), r=%d, color=%s]%n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{
	PointD[] p = new PointD[3];
	
	Triangle(PointD[] p) {
		this.p = p;
	}
	
	void draw() {
		System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]%n", 
				p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
			
}

public class DrawShape {
	
	public static void main(String[] args) {
		PointD[] p = {
				new PointD(100, 100),
				new PointD(140, 50),
				new PointD(200, 100)
		};
		
		Triangle t = new Triangle(p);
		//Circle c = new Circle(new Point(150, 150), 50);
		
		Point p1 = new Point(150, 150);
		Circle c = new Circle(p1, 50);
		
		t.draw();
		c.draw();
	}

}
