package ch8;

public class FinallyTest3 {
	public static void main(String[] args) {
		method1();
		System.out.println("method1()의 수행을 마치고 main메서드로 돌아왔습니다.");
	}
	
	
	static void method1() {
		try {
			System.out.println("method1()이 호출되었습니다.");
			//return이 있어도 finally 블록의 문장은 수행된다.
			return;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("method1()의 finally블록이 실행되었습니다.");
		}
	}

}
