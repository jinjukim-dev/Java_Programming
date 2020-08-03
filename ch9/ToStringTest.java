package ch9;

public class ToStringTest {
	public static void main(String[] args) {
		String str = new String("KOREA");
		java.util.Date today = new java.util.Date();
		
		System.out.println(str);
		System.out.println(str.toString());
		System.out.println(today);
		System.out.println(today.toString());
		
		String s = "kimjinrt";
		int idx1 = s.lastIndexOf("jin");
		int idx2 = s.indexOf("jin");
		System.out.println(idx1);
		System.out.println(idx2);
	}

}
