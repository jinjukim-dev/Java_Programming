package ch6;

class MyPoint{
	int x; //인스턴스 변수
	int y; //인스턴스 변수
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	double getDistance(int x1, int y1) {
		//double xSqrt = Math.sqrt(x1-x);
		//double ySqrt = Math.sqrt(y1-y);
		return Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y));
	}
}

public class Exercise6_7 {
	public static void main(String[] args) {
		MyPoint p = new MyPoint(1, 1);
		
		System.out.println(p.getDistance(2, 2));
	}

}
