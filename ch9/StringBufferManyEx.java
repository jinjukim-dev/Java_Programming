package ch9;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class StringBufferManyEx {
	public static void main(String[] args) {
//		StringBuffer sb = new StringBuffer();
//		System.out.println("sb = "+sb);
//		
//		StringBuffer(int length)
//		length 만큼의 문자를 담을 수 있는 버퍼를 가진 인스턴스 생성
//		StringBuffer sb1 = new StringBuffer(10);
		
//		StringBuffer(String str)
//		str값을 갖는 인스턴스 생성
//		StringBuffer sb2 = new StringBuffer("Hi");
//		System.out.println(sb2);

//		StringBuffer append 
//		문자열의 뒤에 덧붙인다.
//		StringBuffer sb = new StringBuffer("abc"); //abc
//		StringBuffer sb2 = sb.append(true); //abctrue
//		sb.append('d').append(10.0f); //abctrued10.0
//		StringBuffer sb3 = sb.append(123); //abctrued10.0123
//		System.out.println("sb = "+sb);
//		System.out.println("sb2 = "+sb2);
//		System.out.println("sb3 = "+sb3);
		
//		StringBuffer sb = new StringBuffer(100);
//		sb.append("abcd");
//		int bufferSize = sb.capacity();
//		int stringSize = sb.length();
//		System.out.println("bufferSize = "+bufferSize); //StringBuffer buffer 크기
//		System.out.println("stringSize = "+stringSize); //sb에 담긴 문자열의 길이 
		
//		=========== StringBuffer에만 제공되어있는 메서드 =========
//		SttringBuffer delete(int start, int end)
//		end위치 포함 x
//		StringBuffer sb = new StringBuffer("0123456");
//		StringBuffer sb2 = sb.delete(3, 6);
//		System.out.println(sb);
//		System.out.println(sb2); //0126
//		StringBuffer sb3 = sb2.deleteCharAt(3);
//		System.out.println(sb3);
		
//		StringBuffer insert(int pos, boolean ... String str)
//		두 번째 매개변수로 받은 값을 문자열로 변환하여 지정된 pos에 추가
//		StringBuffer sb = new StringBuffer("0123456");
//		sb.insert(4, '.');
//		sb.insert(0, false);
//		System.out.println(sb);
		
//		StringBuffer replace(int start, int end, String str) 
//		end위치 포함 x
//		StringBuffer sb = new StringBuffer("0123456");
//		sb.replace(3, 6, "AB");
//		System.out.println(sb);
		
//		StringBuffer reverse()
//		인스턴스에 저장되어 있는 문자열의 순서를 거꾸로 나열
//		StringBuffer sb = new StringBuffer("0123456");
//		sb.reverse();
//		System.out.println(sb);
		
//		void setCharAt(int index, char ch)
//		지정된 위치 문자를 ch로 바꾼다.
//		StringBuffer sb = new StringBuffer("01233456");
//		sb.setCharAt(5, 'o');
//		System.out.println(sb);
		
//		void setLength(int newLength)
//		지정된 길이로 문자열의 길이를 변경한다. 빈공간은 null문자 \u0000 채움
//		StringBuffer sb = new StringBuffer("0123456");
//		sb.setLength(5);
//		StringBuffer sb2 = new StringBuffer("0123456");
//		sb2.setLength(10);
//		System.out.println("sb = "+sb+".");
//		System.out.println("sb2 = "+sb2+".");
//		
//		//trim() 사용을 위해서 String으로 변환
//		String str = sb2.toString().trim();
//		System.out.println("str = "+str+".");
		
				
	}

}
