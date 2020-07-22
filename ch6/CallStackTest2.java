package ch6;

public class CallStackTest2 {
	
	static void firstMethod() {
		System.out.println("firstMethod() 시작되었음."); //2
		secondMethod();
		System.out.println("firstMethod() 끝났음."); //5
	}
	
	static void secondMethod() {
		System.out.println("secondMethod() 시작되었음."); //3
		System.out.println("secondMethod() 끝났음."); //4
	}
	
	public static void main(String[] args) {
		System.out.println("main(String[] args) 시작되었음."); //1
		firstMethod();
		System.out.println("main(String[] args) 끝났음.");  //6
	}

}
