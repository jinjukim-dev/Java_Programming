package ch6;

class MemberCall {
	
	//클래스 메서드에서는 인스턴스 멤버를 직접 호출할수 없고, 호출 시 인스턴스 생성을 필수로 해야한다.
	//단, 인스턴스 메서드는 별도의 인스턴스를 생성하지 않고도 클래스 멤버(클래스 메서드, 클래스 변수), 인스턴스 멤버(인스턴스 메서드, 인스턴스 변수)를 모두 호출, 참조 가능하다.
	
	//-> 클래스 메서드에서 인스턴스 멤버 호출 시 주의 (인스턴스 생성 필수)

	int iv = 10; //인스턴스 변수
	static int cv = 20; //클래스 변수
	
	int iv2 = cv; //인스턴스 변수
	static int cv2 = new MemberCall().iv; //객체 생성 이후에는 인스터늣 변수 사용 가능
	
	//클래스 메서드
	static void sataticMethod1() {
		System.out.println(cv);
		//System.out.println(iv); 에러. 클래스 메서드에서 인스턴스 변수를 사용 불가
		MemberCall c = new MemberCall();
		System.out.println(c.iv); // 객체 생성이후에는 인스턴스 변수 참조 가능
	}
	
	//인스턴스 메서드
	void instanceMethod1() {
		System.out.println(cv);
		System.out.println(iv); //인스턴스 메서드에서는 인스턴스 변수 바로 사용 가능
	}
	
	//클래스 메서드
	static void staticMethod2() {
		sataticMethod1();
		//instanceMethod1(); 클래스 메서드에서는 인스턴스 메서드 호출할수 없음.
		MemberCall c = new MemberCall();
		c.instanceMethod1(); // 인스턴스를 생성 후에야 인스턴스 메서드 호출 가능
	}
	
	//인스턴스 메서드 
	//인스턴스 메서드에서는 인스턴스 생성없이 인스턴스 메서드, 클래스 메서드 모두 호출가능
	void instanceMethod2() {
		sataticMethod1();
		instanceMethod1();
	}
	
	
}
