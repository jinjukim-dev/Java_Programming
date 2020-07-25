package ch7;

class Card{
	
	/*final이 붙은 상수는 일반적으로 선언과 동시에 초기화를 해야하지만
	인스턴스 변수에 경우 생성자에서 최괴화 되도록 할 수 있다.*/
	
	final int NUMBER;
	final String KIND;
	
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){
		KIND = kind;
		NUMBER = num;
	}
	
	Card(){
		this("HEART", 1);
	}
	
	public String toString() {
		return KIND +" "+NUMBER;
	}
}

public class FinalCardTest {
	public static void main(String[] args) {
		Card c = new Card("SPADE", 5);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
		
		Card c1 = new Card();
		System.out.println(c1.KIND);
		System.out.println(c1.NUMBER);
	}

}
