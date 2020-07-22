package ch5;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class ArrayEx4 {
	
	public static void main(String[] args) {
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(abc);
		System.out.println(num);  //char 배열은 구분자없이 출력
		
		/*char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result); //ABCD0123456789
		
		//ABCCD456789
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//ABCD45ABC9
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);*/
		
		System.out.println();
		
		char[] result1 = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result1, 0, 2);
		System.arraycopy(num, 1, result1, 2, 6);
		System.out.println(result1);
		//AB123456
	}

}
