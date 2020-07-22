package ch6;

class Car{
	String color;
	String gearType;
	int door;
	
	Car() { // 기본 생성자
		this("white", "auto", 4);
	}
	
	Car(String color){
		this(color, "manual", 2);
	}
	
	Car(Car c){ //인스턴스의 복사를 위한 생성자
		color = c.color;
		gearType = c.gearType;
		door = c.door;
		
		//기존의 코드 활용
		//this(c.color, c.gearType, c.door);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	
}

public class CarTest3 {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car(c1); //c1의 복사본 c2를 생성
		
		System.out.printf("c1의 color=%s, gearType=%s, door=%d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d%n", c2.color, c2.gearType, c2.door);
		
		c1.door = 100; 
		//c1과 c2는 서로 독립적으로 메모리 공강에 존재하는 별도의 인스턴스 이므로 c1의 값이 변경되어도 c2는 영향을 받지 않는다.
		System.out.println("c1.door=100; 수행 후 ");
		
		System.out.printf("c1의 color=%s, gearType=%s, door=%d%n", c1.color, c1.gearType, c1.door);
		System.out.printf("c2의 color=%s, gearType=%s, door=%d%n", c2.color, c2.gearType, c2.door);
		
	}

}
