package ch11;

import java.util.*;

public class ExpValidCheck {
	public static void main(String[] args) {
		
		Stack st = new Stack<>();
		String expression = "((2+3)*1)+3";
		
		System.out.println("expression : "+expression);
		
		try {
			for(int i=0; i<expression.length(); i++) {
				char ch = expression.charAt(i);
				
				if(ch == '(') {
					st.push(ch+""); //push 반환값이 Object이므로 String으로 만들어주기
				}else if(ch == ')') {
					st.pop();
				}
				
				//괄호 종류 추가해서 만들어보기
				
			
			}
			
			if(st.isEmpty()) {
				System.out.println("괄호가 일치합니다.");
			} else {
				System.out.println("괄호가 일치하지 않습니다.");
			}
		} catch (EmptyStackException e) {
			System.out.println("괄호가 일치하지 않습니다.");
		}
	}

}
