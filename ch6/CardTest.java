package ch6;

class Card{
	String kind; //카드의 무늬
	int number; //카드의 숫자
	static int width = 100;
	static int height = 250;
}

public class CardTest {
	
	public static void main(String[] args) {
		System.out.println("Card.width = "+Card.width);
		System.out.println("Card.height ="+Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.printf("c1은 %s, %d 이며, 크기는 (%d, %d)%n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2은 %s, %d 이며, 크기는 (%d, %d)%n", c2.kind, c2.number, c2.width, c2.height);
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.printf("c1은 %s, %d 이며, 크기는 (%d, %d)%n", c1.kind, c1.number, c1.width, c1.height);
		System.out.printf("c2은 %s, %d 이며, 크기는 (%d, %d)%n", c2.kind, c2.number, c2.width, c2.height);
		
	}

}
