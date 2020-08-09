package ch7;

class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck(){	
		//배열 SutdaCard를 적절히 초기화 
		//내 코드
		/*for(int i=0; i<cards.length/2; i++) { //0~9
			cards[i] = new SutdaCard(i+1, false);
			
			if(cards[i].num == 1 || cards[i].num == 3 || cards[i].num == 8)
				cards[i] = new SutdaCard(i+1, true);
			
			for(int j=10; j<cards.length; j++) { //10~19
				cards[j] = new SutdaCard(j-9, false);
			}
		}*/
		
		//답안
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10) && (num==1 || num==3 || num==8);
			
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
	
	//7_2
	public void shuffle() {
		//배열 cards에 담긴 카드의 위치를 뒤섞는다. (Math.random()사용)
		for(int i=0; i<cards.length; i++) {
			int j = (int)(Math.random()*CARD_NUM);
			
			SutdaCard tmp;
			//섞기
			tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}

	public SutdaCard pick(int index) {
		//유효성 검사
		if(index < 0 || index > CARD_NUM)
			return null;
		//배열 cards에서 지정된 위치 SutdaCard를 반환
		return cards[index];
	}
	
	public SutdaCard pick() {
		//배열 cards에서 임의의 위치의 SutdaCard를 반환
		int rand = (int)(Math.random()*CARD_NUM);
		return cards[rand];
	}
	
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1, true);
	}

	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
}


public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(i != deck.cards.length-1 ? deck.cards[i]+", " : deck.cards[i]+".");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
