package ch9;

public class StringBufferEx1 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		System.out.println("sb == sb2 ? "+ (sb == sb2));
		
		//StringBuffer에는  equals메서드를 오버라이딩하지 x 등가비교연산자와 같은 결과
		System.out.println("sb.equals(sb2) ? "+sb.equals(sb2));
		
		//StringBuffer를 String으로 변환
		String s = sb.toString();
		String s2 = sb2.toString();
		
		System.out.println("s.equals(s2) ? "+s.equals(s2)); //true
	}

}
