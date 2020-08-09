package ch9;

import java.util.*;

public class RandomEx1 {
	public static void main(String[] args) {
		Random rand = new Random(2);
		Random rand2 = new Random(2);
		
		System.out.println("== rand ==");
		for(int i=0; i<5; i++)
			System.out.println(i+" : "+rand.nextInt());
		
		System.out.println();
		System.out.println("== rand2 ==");
		for(int i=0; i<5; i++)
			System.out.println(i+" : "+rand2.nextInt());
		
		//Random 인스턴스에 종자값이 같으면 항상 같은 값의 순서로 반환한다.
	}

}
