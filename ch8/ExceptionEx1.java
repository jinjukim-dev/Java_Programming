package ch8;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			//try, catch문 앞에 또 다른 try-catch문 포함 가능
			try {} catch (Exception e) {}
		} catch (Exception e) {
			//try {} catch (Exception e) {} 같은 이름의 e 참조변수 사용으로 에러
		}
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
