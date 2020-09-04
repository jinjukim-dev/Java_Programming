package ch11;

import java.util.*;

public class TreeSetLotto {
	public static void main(String[] args) {
		Set set = new TreeSet();    // 범위 검색, 정렬, 정렬할 필요 없음
//		Set set = new HashSet<>();  // 정렬 필요
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num); //set.add(new Integer(num));
		}
		
		System.out.println(set);
	}

}

//class Test implements Comparable{
//
//	@Override
//	public int compareTo(Object o) {
//		return -1;
//	} //비교 기준이 없음.
//}
//
//class TestComp implements Comparator{
//
//	@Override
//	public int compare(Object arg0, Object arg1) {
//		return 1;
//	}
//	
//}