package ch6;

class Data1{

	int value;
}

class Data2 {
	int value;
	
	Data2(int x){ //매개변수 x가 있는 생성자
		value = x;
		System.out.println("value : "+value);
	}
}

public class ConstructorTest {
	
	public static void main(String[] args) {
		
		//클래스에 정의된 생성자가 없는 경우에는 컴파일러가 기본 생성자를 추가해줘서 작동
		Data1 d1 = new Data1();
		
		// Data2 d2 = new Data2(); 컴파일 에러
		// 해결 1. 매개변수 넣어주기 Data2(10)
	}	// 해결 2. Data2에 기본 생성자 만들어주기 

}
