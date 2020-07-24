package ch7;

//생성자가 private이므로 객체 생성 불가능한 클래스 표시로 final 표시해주기
final class Singleton{
	//클래스 내에서는 객체 생성 가능
	private static Singleton s = new Singleton();
	
	private Singleton() {
		//private로 생성자 생성하여 인스턴스 생성 불가
	}
	
	//객체 생성이 불가능하나 static메서드는 객체 생성없이 호출가능하므로 사용 가능
	public static Singleton getInstance() {
		if(s == null) {
			s = new Singleton();
		}
		return s;
	}
}

public class SingletonTest {
	
	public static void main(String[] args) {
		//Singleton s = new Singleton(); 인스턴스 생성 불가
		
		//getInstance()가 static method이므로 객체 생성없이 호출 가능
		Singleton s = Singleton.getInstance();
	}

}
