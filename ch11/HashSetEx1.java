package ch11;

import java.util.*;

public class HashSetEx1 {
	public static void main(String[] args) {
		Object[] objArr =  {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			System.out.println(objArr[i]+"="+set.add(objArr[i]));
		}
		
		//HashSet에 저장된 요소들을 출력한다.
		System.out.println(set);
		
		//HashSet에 저장된 요소들을 출력한다.(Iterator이용)
		Iterator it = set.iterator();
		
		while(it.hasNext()) { //읽어올 요소가 있는지 확인
			System.out.println(it.next()); //요소 하나 꺼내오기
		}
	}

}
