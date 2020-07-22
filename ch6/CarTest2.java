package ch6;

//this - 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다.
//this() - 생성자, 같은 클래스의 다른 생성자를 호출할때 사용

/*class Car {
	String color;
	String gearType;
	int door;
	
	Car() { //기본 생성자
		this("black", "auto", 4);
	}
	
	Car(String color){
		this(color, "manual", 10);
	}
	
	Car(String color, String gearType, int door){
		
		//매개변수를 인스턴스 변수에 담기
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}*/

public class CarTest2 {
	
	public static void main(String[] args) {
		Car c1 = new Car(); //Car() {};
		Car c2 = new Car("blue"); //Car(String color) {}; 호출
		
		System.out.printf("c1의 color=%s, gearType=%s, door=%d%n", c1.color, c1.gearType, c1.door); //black, auto, 4
		System.out.printf("c2의 color=%s, gearType=%s, door=%d", c2.color, c2.gearType, c2.door); //blue, manual, 10
		
	}

}
