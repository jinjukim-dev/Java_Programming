package ch9;

import java.util.Arrays;
import java.util.Date;

//String클래스 생성자와 메서드
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
		//문자열을 상수풀에 등록
		String strItn1 = new String("abc");
		String strItn2 = new String("abc");
		
		boolean bItn = (strItn1 ==  strItn2); //false
		boolean bItn2 = strItn1.equals(strItn2); //true
		boolean bItn3 = 
				(strItn1.intern() == strItn2.intern()); //true
		//이미 상수풀에 같은 내용의 문자열이 있는 경우 그 문자열의 주소값을 반환
		System.out.println("strItn1.intern() = "+strItn1.intern());
		System.out.println("strItn2.intern() = "+strItn2.intern());
		System.out.println(bItn);
		
		//int lastIndexOf(int ch)
		//문자열 오른쪽에서부터 찾아서 위치 반환
		String s10 = "java.lang.Object";
		int idx6 = s10.lastIndexOf('.');
		System.out.println("idx6 : "+idx6);
		
		//int lastIndexOf(String str)
		String name = "kimjinjudklsgjo";
		int nameSrt = name.indexOf("jin");
		int nameEnd = name.lastIndexOf("jin");
		System.out.println("jin 단어 시작 : "+nameSrt);
		System.out.println("jin 단어 끝 : "+nameEnd);
		
		//String replace(char old, char nw)
		//문자열 중의 문자열(old)를 새로운 문자열(nw)로 바꾼 문자열 반환
		String s11 = "Hellokllo";
		String s12 = s11.replace("kllo", "~");
		System.out.println(s12);
		
		//String replaceAll(String regex, String replacement)
		String ab = "AABBAABB";
		String r = ab.replaceAll("BB", "bb");
		System.out.println(r);// AAbbAAbb
		
		//String replaceFirst(String regex, String replacement)
		//replaceAll과 다르게 첫번째 것만 바꿔준다.
		String rFirst = ab.replaceFirst("BB", "bb");
		System.out.println(rFirst); //AAbbAABB
		
		//String[] split(String regex)
		//regex(분리자)로 나누어 배열에 담아 반환
		String animals = "dog,cat,bear,rabbit";
		String[] arr = animals.split(",");
		System.out.println(Arrays.toString(arr));
		
		String[] arr1 = animals.split(",", 2);
		for(int j = 0; j<arr1.length; j++) {
			System.out.printf("arr[%d] = %s%n", j, arr1[j]);
		}
		
		//boolean startWith(String prefix) <-> endsWith
		boolean b5 = s10.startsWith("java");
		System.out.println(b5);
		
		//String substring(int begin, [int end])
		//String s10 = "java.lang.Object";
		String o = s10.substring(10); //(10, 16) 10자리부터 끝까지 출력
		String p = s10.substring(5, 9);
		System.out.println("o : "+o+", p = "+p);
		
		//String toLowerCase()
		//소문자로 변환
		String str = "HELLO WORLD";
		String sLow = str.toLowerCase();
		System.out.println(sLow);
		System.out.println("sLow.toUpperCase() :"+sLow.toUpperCase()); //다시 대문자로 변환
		
		//String toString()
		//String 인스턴스에 저장되어있는 문자열 반환
		String nickname = "jinjukkk";
		String toStr = nickname.toString();
		System.out.println(toStr);
		
		//String trim()
		//문자열의 오른쪽과 왼쪽의 공백만 없애고 반환
		String str1 = "        I'm jinju kim          ";
		String sTrim = str1.trim();
		System.out.println(sTrim); //중간 공백은 제거되지 않는다.
		
		//static String valueOf()
		//지정된 값을 문자열로 변환하여 반환
		//참조변수인 경우 toString()을 호출하여 반환
		String bool = String.valueOf(true);
		System.out.println(bool);
		String f = String.valueOf(10.00f);
		System.out.println(f);
		
		Date dd = new Date();
		String date = String.valueOf(dd); //Date도 가능
		System.out.println(dd);
		
	}

}
