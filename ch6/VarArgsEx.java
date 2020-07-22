package ch6;

public class VarArgsEx {
	
	//가변인자(varags)
	static String concatenate(String delim, String ...args) {
		String result="";
		
		for(String str : args)
			result += str + delim;
		
		return result;
	}
	
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		
		System.out.println(concatenate("", "100", "200", "300"));
		System.out.println(concatenate("-", strArr));
	}
	
	/* 가변인자를 선언한 메서드를 오버로딩하면 메서드 호출 시 구별하지 못하는 경우 발생하기 쉽다.
	   가능하면 가변인자를 사용한 메서드는 오버로딩하지 않는 것이 좋음.
	 static String concatenate(String ...args) {
		return concatenate("", args);
	}*/

}
