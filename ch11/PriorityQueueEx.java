package ch11;

import java.util.*;

public class PriorityQueueEx {
	
	//저장순서와 관계없이 우선순위가 높은 것부터 꺼내게 된다
	//null 저장시 nullPointerException
	public static void main(String[] args) {
		Queue pq = new PriorityQueue();
		pq.offer(3); //pq.offer(new Interger(3)); 오토박싱
		pq.offer(1);
		pq.offer(5);
		pq.offer(2);
		pq.offer(4);
		System.out.println(pq);
		
		Object obj = null;
		
		while((obj = pq.poll()) != null)
			System.out.println(obj);
	}

}
