package ch9;

public class HashCodeEx1 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2)); //true
		/*
		 * String클래스는 문자열의 내용이 같으면 동일한 해시코드를 반환하도록 
		 * hashCode메서드가 오버라이딩 되어있기 때문이다.
		 */
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		/*
		 * 그러나 System.identityHashCode는 
		 * 모든 객체에 대해 항상 다른 해시코드해시코드값을 반환
		 */
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}

}