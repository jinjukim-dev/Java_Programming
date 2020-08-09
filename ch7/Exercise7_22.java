package ch7;

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea(); //도형의 면적을 계산해서 반환하는 메서드

	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
	
}

class Circle extends Shape{
	double r;
	
	Circle(double r) {
		this(new Point(0,0), r);
	}
	
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}

	@Override
	double calcArea() {
		return Math.PI*r*r;
	}
	
}

class Rectangle extends Shape{
	double width;
	double height;
	
	Rectangle(double width, double height){
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double w, double h){
		super(p);
		this.width = w;
		this.height = h;
	}
	
	public boolean isSquare() {
		return width == height ? true : false;
	}

	@Override
	double calcArea() {
		return width*height;
	}
	
}

class Point{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "["+x+", "+y+"]";
	}
}

public class Exercise7_22 {
	
	//7_23
	public static double sumArea(Shape[] arr) {
		
		double total = 0.0;
		
		for(int i=0; i<arr.length; i++) {
		/*	if(arr[i] instanceof Circle) {
				Circle c = (Circle) arr[i];
				total += c.calcArea();
			}
			
			if(arr[i] instanceof Rectangle) {
				Rectangle r = (Rectangle) arr[i];
				total += r.calcArea();
			}*/
			
			total += arr[i].calcArea();
				
		}
		
		return total;
	}
	
	public static void main(String[] args) {
		
		Shape[] arr = {new Circle(5.0), new Rectangle(3, 4), new Circle(1)};
		System.out.println("면접의 합:"+sumArea(arr));
		
	}

}
