package ch9;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
	public static void main(String[] args) {
		String data = "100,,,200,300";
		
		String[] result = data.split(",");
		StringTokenizer st = new StringTokenizer(data, ",");
		
		for(int i=0; i<result.length; i++)
			System.out.print(result[i]+"|");
		
		System.out.println("개수 : "+result.length);
		
		int i=0;
		for(; st.hasMoreTokens(); i++) {
			System.out.print(st.nextToken()+"|");
		}
		
		System.out.println("개수 : "+i);
		
		//split() 빈 문자열도 토큰으로 인식 5개
		//StringTokenizer은 빈 문자열을 토큰으로 인식하지 x 3개
	}

}
