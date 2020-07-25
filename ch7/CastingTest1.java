package ch7;

public class CastingTest1 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
		fe2 = (FireEngine)car; //Down-casting 형변환 생략 불가
		fe2.water();
		//car.water(); 사용불가
		//참조변수 car는 Car타입으로 Car클래스 멤버가 아닌 water()메소드 사용 불가xx
		
		//Car car = null;
		//car = fe;
		// = 
		//Car car = new FireEngine();
				
	}

}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("drive, Brrrrr~");
	}
	
	void stop() {
		System.out.println("stop!!!!");
	}
	
}

class FireEngine extends Car{
	void water() {
		System.out.println("Water!!!");
	}
}
