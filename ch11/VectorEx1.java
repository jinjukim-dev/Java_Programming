package ch11;

import java.util.*;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");
		print(v);
		
		v.trimToSize();
		System.out.println("=== Atfer trimToSize() ===");
		print(v);
		
		v.ensureCapacity(6); //용량이 최소한 6이 되도록
		System.out.println("=== Atfer ensureCapacity() ===");
		print(v);
		
		v.setSize(7); //용량이 6으로 부족하므로 2배 증가되어 capacity=12가 된다.
		System.out.println("=== Atfer setSize(7) ===");
		print(v); 
		
		v.clear(); //v의 모든 요소 삭제
		System.out.println("=== After clear() ===");
		print(v);
		
		
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : "+v.size());
		System.out.println("capacity : "+v.capacity());
	}

}
