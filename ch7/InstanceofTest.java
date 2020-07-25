package ch7;

public class InstanceofTest {
	
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		//instanceof연산의 결과가 true라는 것은 검사한 타입으로의 형변환 가능하다는 뜻
		
		if(fe instanceof FireEngine) {
			System.out.println("This is a FireEngine instance.");
		}
		
		if(fe instanceof Car) {
			System.out.println("This is a Car instance.");
		}
		
		if(fe instanceof Object) {
			System.out.println("This is an Object instance.");
		}
		
		System.out.println(fe.getClass().getName());

	}

}
