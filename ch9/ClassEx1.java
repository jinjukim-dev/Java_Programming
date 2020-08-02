package ch9;

final class Card1{
	String kind;
	int num;
	
	Card1(){
		this("SPADE", 1);
	}
	
	Card1(String k, int n){
		this.kind = k;
		this.num = n;
	}
	
	public String toString() {
		return kind+" : "+num;
	}
}

public class ClassEx1 {
	public static void main(String[] args) {
		Card1 c = new Card1("HEART", 3);
		Card1 c2 = null;
		try {
			c2 = Card1.class.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		Class cObj = c.getClass();
		
		System.out.println(c);
		System.out.println(c2);
		System.out.println(cObj.getName());
		System.out.println(cObj.toGenericString());
		System.out.println(cObj.toString());
		
	}

}
