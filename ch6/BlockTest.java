package ch6;

public class BlockTest {
	
	//클래스 초기화 블럭 - 처음 메모리에 로딩될 때 한번
	static {
		System.out.println("static { }"); //1.가장 먼저 클래스 초기화 블럭이 가장 먼저 수행
	}
	
	//인스턴스 초기화 블력 - 인스턴트가 생성될 때 마다 수행
	{
		System.out.println("{ }"); //3. 인스턴스 초기화 블럭 수행
	}
	
	//생성자 - 인스턴스가 될 때 마다 실행 
	public BlockTest() {
		System.out.println("생성자"); //4.생성자 수행 (생성자가 마지막)
	}
	
	public static void main(String[] args) { //main 메서드 수행
		System.out.println("BlockTest bt = new BlockTest(); "); //2. 인스턴스 생성 
		BlockTest bt = new BlockTest();
		
		System.out.println("BlockTest bt2 = new BlockTest();");
		BlockTest bt2 = new BlockTest();
	}

}
