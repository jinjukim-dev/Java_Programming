package ch11;

import java.util.*;

public class MyStack extends Vector{
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	
	public Object pop() {
		Object obj = peek();
		removeElementAt(size() - 1);
		return obj;
	}
	
	public Object peek() {
		int len = size();
		
		if(len == 0)
			throw new EmptyStackException();
		return elementAt(len -1);
	}
	
	public boolean empty() {
		return size() == 0;
	}
	
	public int search(Object o) {
		int i = lastIndexOf(o); //끝에서부터 객체를 찾는다.
		
		if(i >= 0) {
			return size()-i;
		}
		
		return -1; //해당 객체를 찾지 못한 경우
	}

}
