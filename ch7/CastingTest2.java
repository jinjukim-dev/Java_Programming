package ch7;

public class CastingTest2 {
	public static void main(String[] args) {
		Car car = new Car();
		Car car2 = null;
		//FireEngine fe = null;
		FireEngine fe = new FireEngine();
		
		car.drive();
		//fe = (FireEngine)car;
		// FireEngin fe = new Car(); 불가 x
		// why? 조상타입의 인스턴스가 자식타입의 참조변수로 참조하는것 xx
		fe.drive();
		car2 = fe;
		// Car car2 = new FireEngine(); ok
		car2.drive();
	}

}
