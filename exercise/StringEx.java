package exercise;

public class StringEx {
	
	public static void main(String[] args) {
		
		//split
		String str = "010-1234-5678";
		String[] mobNum = str.split("-");
		
		for(String string : mobNum)
			System.out.println(string);
		
		//substring - 문자열 뽑기
		String str1 = "JavaProgramming";
		String str2 = "jspWeb";
		
		String tmp = str1.substring(0,4) + str2.substring(3,6);
		
		System.out.println(tmp); //JavaWeb 출력하기
		
		
		//indexOf - 해당문자 위치 찾기
		String str3 = "Hello World!";
		System.out.println(str3.indexOf("o"));
		System.out.println(str3.lastIndexOf("o")); //끝에서 부터 찾기
		System.out.println(str3.indexOf("hi")); //없으면 -1 출력
		System.out.println(str3.indexOf("Hello")); //단어의 시작 문자위치 출력
		
		str3 = "Hello World! Hello World!";
		System.out.println(str3.indexOf('H', 2)); //2번째 자리서 부터 H 찾기
		
		
		//replace 문자열 치환 replace("기존문자", "바꿀문자");
		String a = "개나리 삼천리 화려강산 대한사람 대한으로";
		System.out.println(a);
		System.out.println("replace 후 : "+a.replace("개나리", "무궁화"));
		
		//replaceFist는 해당 단어가 여러개 있어도 첫 번째 하나만 변경.
		String b = "포도 포도 오렌지 딸기 바나나";
		System.out.println(b);
		System.out.println("replaceFirst 후 : "+b.replaceFirst("포도", "멜론"));
		
		
		//String format
		
		//3자리마다 콤마 찍기 (%,d)
		System.out.printf("총 %,d원을 가지고 있습니다.%n", 2000000);
		
		//소수점 반올림 (%.숫자f) 반올림하여 숫자만큼 표현
		System.out.printf("소수점 3자리 반올림 한 수는 %.5f%n", 0.5555555);
		
		float f = 0.3456667f;
		
		//3456.67 만들기
		System.out.printf("f 변경 후 숫자 : %.2f", f*10000);
			
	}

}
