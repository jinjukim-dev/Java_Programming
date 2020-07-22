package ch4;

public class FlowEx31 {

	public static void main(String[] args) {
		
		for(int i=1; i<= 10; i++) {
			if(i%3 == 0)
				continue;
			
			System.out.println(i); //3의 배수를 제외하고 출력됨
		}

	}

}
