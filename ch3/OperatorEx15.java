package ch3;

public class OperatorEx15 {
	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		System.out.println(upperCase);
		
		//float pi = 3.141592f;
		//float shortPi = (int)(pi * 1000) / 1000f;
		
		//System.out.println(shortPi);
		
		//double pi = 3.141592;
		//double shortPi = (int)(pi * 1000 + 0.5) / 1000.0;
		//System.out.println(shortPi);
		
		double pi = 3.141592;
		double shortPi = Math.round(pi*1000) / 1000.0;
		
		System.out.println(shortPi);
		
		String str1 = "abc";
		String str2 = new String("abc");
		
		System.out.printf("str2 == \"abc\" ? %b%n", str2 == "abc");
		System.out.printf("str2.equalsIgnoreCase (\"ABC\") ? %b%n", str2.equalsIgnoreCase("ABC"));
		
		
		
		
		
	}

}
