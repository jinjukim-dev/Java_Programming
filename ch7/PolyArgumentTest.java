/*package ch7;

import java.util.*;

class Product{
	int price;		//제품의 가격
	int bonusPoint; //제품구매 시 제공하는 보너스 점수
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv(){
		super(100); //Tv의 가격 100만원 
	}
	
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer(){
		super(200);  //컴퓨터 가격 200만원
	}
	
	public String toString() {return "Computer";}
}

class Audio extends Product{
	Audio(){super(50);}
	
	public String toString() {
		return "Audoi";
	}
}

class Buyer{			//고객, 물건을 사는 사람
	int money = 1000; 	//소유금액
	int bonusPoint = 0;//보너스 점수
	Product[] item = new Product[10];
	int i=0; //Product배열에 사용될 카운터
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[i++] = p; //제품을 Product[] item에 저장
		System.out.println(p+"을/를 구입하셨습니다."); //p는 참조변수가 담겨서 참조변수.toString()메서드 출력
		
	}
	
	void summary() {	//구매한 물펌에 대한 정보를 요약해서 보여주기
		int sum = 0;	//구입한 물품의 가격 합계
		String itemList = ""; //구입한 물품목록
		
		for(int i=0; i<item.length; i++) {
			if(item[i] == null) break;
			sum += item[i].price;
			
			itemList += (i==0) ? item[i] : ", "+item[i];		
		}
		
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}

public class PolyArgumentTest {
	
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tv()); //100
		b.buy(new Computer()); //200
		b.buy(new Audio()); //20
		
		b.summary();
		
	}

}
*/