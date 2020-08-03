package ch9;

import java.util.StringJoiner;

public class StringEx4 {
	
	public static void main(String[] args) {
		String animals = "dog,cat,bear";
		String[] arr = animals.split(",");
		
		//방법1
		System.out.println(String.join("-", arr));
		
		//방법2
		StringJoiner sj = new StringJoiner("/", "[", "]"); // (구분자, 첫번째 삽입, 마지막 삽입)
		for(String str : arr)
			sj.add(str);
		
		System.out.println(sj.toString());
	}

}
