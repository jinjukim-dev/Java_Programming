package ch9;

public class StringManyEx {
	public static void main(String[] args) {
		
		//String(String s)
		String s = new String("Hello");
		System.out.println(s);
		
		//String(char[] value)
		char[] cArr = {'H', 'E', 'L', 'L', 'O'};
		String s1 = new String(cArr);
		System.out.println(s1);
		
		//String(StringBuffer buf)
		StringBuffer sb = new StringBuffer("Hello");
		String s2 = new String(sb);
		System.out.println(s2);
		
		//char charAt(int index)
		String s3 = "Hello";
		String n = "0123456";
		char c = s3.charAt(1);
		char c1 = n.charAt(1);
		System.out.println("c="+c);
		System.out.println("c1="+c1);
		
		//int compareTo(String str)
		int i = "aaa".compareTo("aaa");
		int i2 = "aaa".compareTo("bbb");
		int i3 = "bbb".compareTo("aaa");
		System.out.println("i = "+i); //같은면 0
		System.out.println("i2 = "+i2); //사전순 이전이면 -1
		System.out.println("i3 = "+i3); //사전순 이후면 1
		
		//String concat(String str)
		//문자열을 뒤에 붙인다
		String s4 = "Hello";
		String s5 = s4.concat(" World!");
		System.out.println(s5);
		
		//boolean contains(CharSequence s)
		//문자열을 포함하는지 검사
		String s6 = "abcdefg";
		boolean b = s6.contains("bc");
		System.out.println(b);
		
		//boolean endsWith(String suffix)
		//지정된 문자열로 끝나는지 검사
		String file = "Hello.txt";
		boolean b1 = file.endsWith("txt");
		System.out.println(b1);
		
		//boolean equals(Object obj)
		//문자열 비교
		String s7 = "Hello";
		boolean b2 = s7.equals("Hello");
		boolean b3 = s7.equals("hello");
		System.out.println(b2);
		System.out.println(b3); // equals는 대소문자까지 비교함
		
		//boolean equalsIgnoreCase(String str)
		//문자열 대소문자 구분없이 비교
		boolean b4 = s7.equalsIgnoreCase("hello");
		System.out.println(b4); //true
		
		//int indexOf(int ch)
		//해당 인덱스 위치 반환, 없으면 -1, 대소문자 구분
		String s8 = "Hello";
		int idx1 = s8.indexOf('o');
		int idx2 = s8.indexOf('k');
		System.out.println(idx1); //4
		System.out.println(idx2); //false
		
		//int indexOf(int ch, int pos)
		//지정된 위치(pos)부터 주어진 문자(ch) 찾기
		int idx3 = s8.indexOf('e', 0);
		int idx4 = s8.indexOf('e', 2); //-1
		System.out.println(idx3);
		System.out.println(idx4);
		
		//int indexOf(String str);
		String s9 = "ABCDEFGH";
		int idx5 = s9.indexOf("CD");
		System.out.println(idx5);
		
		//String intern()
		
		
		//int lastIndexOf(int ch)
		//문자열 오른쪽에서부터 찾아서 위치 반환
		String s10 = "java.lang.Object";
		int idx6 = s10.lastIndexOf('.');
		System.out.println("idx6 : "+idx6);
		
		//int lastIndexOf(String str)
		System.out.println(s10);
		int idx7 = s10.indexOf("java");
		int idx8 = s10.lastIndexOf("Object");
		System.out.println("Object 단어의 시작하는 곳 : "+idx7+", 끝나는 곳 : "+idx8);
	}

}
