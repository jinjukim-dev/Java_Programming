package ch11;

import java.util.*;

public final class HashMapEx3 {
	
	static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		addPhoneNo("친구", "이자바", "010-111-1111");
		addPhoneNo("친구", "김자바", "010-111-5478");
		addPhoneNo("친구", "박자바", "010-234-1111");
		addPhoneNo("회사", "이대리", "010-111-1111");
		addPhoneNo("회사", "김대리", "010-111-5465");
		addPhoneNo("회사", "박대리", "010-454-1111");
		addPhoneNo("회사", "송대리", "010-111-2222");
		addPhoneNo("세탁", "010-888-8888");
		
		printList();
	}
	
	//그룹을 추가하는 메서드
	static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName))
			phoneBook.put(groupName, new HashMap());
	}
	
	//그룹에 전화번호를 추가하는 메서드
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name); // 이름은 중복될 수 있으니 전화번호를 key로 저장
	}
	
	//그룹이 없는 경우
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	//전화번호부 전체를 출력하는 메서드
	static void printList() {
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			
			System.out.println(" * "+e.getKey()+"["+subSet.size()+"]");
			
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String telNo = (String)subE.getKey();
				String name = (String)subE.getValue();
				System.out.println(name+" "+telNo);
			}
			System.out.println();
		}
	}

}
