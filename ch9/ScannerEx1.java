package ch9;

import java.util.*;

public class ScannerEx1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] argArr = null;
		
		while(true) {
			String prompt = ">>";
			System.out.print(prompt);
			
			//화면으로부터 라인단위로 입력받는다.
			String input = s.nextLine();
			
			input = input.trim();
			argArr = input.split(" +"); //공백을 구분자로 자른다. 정규식으로 " +"공백이 여러개일수 있다.ㅗㄷ
			
			String command = argArr[0].trim();
			
			if("".equals(command)) continue;
			
			command = command.toLowerCase();
			
			if(command.equals("q")) {
				System.exit(0);
			}else {
				for(int i=0; i<argArr.length; i++)
					System.out.println(argArr[i]);
			}
				
		}
	}

}
