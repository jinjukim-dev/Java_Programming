package ch6;

class Product{
	
	static int count = 0; //생성된 인스턴스의 수를 저장하기 위한 변수 (클래스 변수)
	int serialNo; // 인스턴스 고유의 번호
	
	//인스턴스 초기화 블럭
	//Product 인스턴스가 생성될 때마다 count의 값을 1씩 증가시켜서 serialNo에 저장
	{
		++count;
		serialNo = count;
	}
	
	public Product() {} //기본생성자, 생략가능
	
}

public class ProductTest {
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1의 제품번호(serial no)는 "+p1.serialNo);
		System.out.println("p2의 제품번호(serial no)는 "+p2.serialNo);
		System.out.println("p3의 제품번호(serial no)는 "+p3.serialNo);
		
		//Product class에서 count가 인스턴스 변수이면, 객체를 생성해서 사용해야함 
		//이렇게 되면 호출 시 초기화 되기 때문에 계속 해서 1인 값만 나오게 된다.
		//Product pd = new Product();
		//System.out.println("생산된 제품의 수는 모두 "+pd.count+"개 입니다.");
		
		//클래스 변수는 인스턴스 생성없이 바로 사용가능 
		System.out.println("생산된 제품의 수는 모두 "+Product.count+"개 입니다.");
	}

}
