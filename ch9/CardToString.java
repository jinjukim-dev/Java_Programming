package ch9;

class Card{
	String kind;
	int number;
	
	Card(){
		this("SPADE", 10);
	}
	
	Card(String kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		return "kind : "+kind+", number : "+number;
	}

}

public class CardToString {
	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card("HEART", 4);
		
		/* toString을 오버라이딩 하지 않으면 
		 * 클래스 이름에 16진수의 해시코드를 얻게 된다.
		 */
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}

}
