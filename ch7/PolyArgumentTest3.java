package ch7;

import java.util.*;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
	
	Product(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv extends Product{
	Tv(){
		super(100);
	}
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product{
	Computer(){
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{
	Audio(){
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer{
	int money = 1000; //소유금액
	int bonusPoint = 0; //소유 보너스 포인트
	Vector item = new Vector();
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"을/를 구매하셨습니다.");
	}
	
	void refund(Product p) {	//반품 메서드
		if(item.remove(p)) {	//제품을 Vector에서 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"을/를 반품하셨습니다.");
		}else {
			System.out.println("구입하신 제품 중 해당 제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0; //구매 물품의 가격합계
		int totalBonus = 0; //구매한 물품에 대한 보너스 합계
		String itemList = "";
		
		if(item.isEmpty()) { //vector가 비어있는지 확인한다.
			System.out.println("구입하신 제품이 없습니다");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product)item.get(i); //Vector의 i번째에 있는 객체를 얻어온다.
			sum += p.price;
			totalBonus += p.bonusPoint;
			itemList += (i==0) ? ""+p : ", "+p;
		}
		
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원입니다.");
		System.out.println("구입하신 물품의 총 보너스 금액은 "+totalBonus+"점 입니다.");
		System.out.println("구입하신 제품은 "+itemList+"입니다.");
	}
}

public class PolyArgumentTest3 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}

}
