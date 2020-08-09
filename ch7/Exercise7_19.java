package ch7;

import java.util.Arrays;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
		
		b.summary();
		
	}
}

class Buyer{
	int money = 1000;
	Product[] cart = new Product[3]; // 구입한 제품을 저장하기 위한 배열
	int i = 0; //Product 배열 cart에 사용될 index
	
	void buy(Product p) {
		//지정된 물건을 구입한다. 가진돈 money에서 물건의 가격을 뺴고 cart에 담는다.
		//만일 가진 돈이 물건의 가격보다 적다면 바로 종료
		if(money > p.price) {
			money -= p.price;
			add(p);
		} else {
			System.out.println("잔액이 부족하여 "+p.toString()+"을/를 살 수 없습니다.");
		}

	}
	
	void add(Product p) {
		//지정된 물건을 장바구니에 담는다.
		//만일 장바구니에 담을 공간이 없으면, 장바구느이 크기를 2배로 늘린 다음에 담는다.
		if(i >= cart.length) {
			Product[] nCart = new Product[cart.length*2];
			nCart[i] = p;
			for(int j=0; j<cart.length; j++) { //배열을 복사할떄 j<nCart.length로 설정해서 배열 범위 초과 에러가 났었음.
				nCart[j] = cart[j];
			}
			cart = nCart; //기존의 장바구니로 바꾼다.
		}
		cart[i] = p;
		i++;
	}
	
	void summary() {	
		int payMoney = 0; //사용한 금액
		
		System.out.print("구입한 물건 : ");
		for(int i=0; i<cart.length; i++) {
			
			if(cart[i] == null)
				break;

			System.out.print(i == cart.length-1? cart[i] : cart[i]+", ");
			
			payMoney += cart[i].price;
	
		}
		System.out.println();
		
		System.out.println("사용한 금액 : "+payMoney);
		System.out.println("남은 금액 : "+money);
				
	}
	
}

class Product{
	int price;  //제품의 가격
	
	Product(int price){
		this.price = price;
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