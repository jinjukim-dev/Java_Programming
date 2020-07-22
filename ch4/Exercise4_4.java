package ch4;

//x
public class Exercise4_4 {
	
	public static void main(String[] args) {

		int sum = 0; //총합을 저장할 변수
		int i = 0;
		int num = 0;
		
		while(sum < 100) {
			
			i++;
			
			if(i % 2 == 0) {
				num += i*(-1);				
			} else {
				num += i;
			}

			sum += num;
						
		}
		System.out.println("num = "+num);
		System.out.println("sum = "+sum);
		System.out.println(i);
		
	}
}
