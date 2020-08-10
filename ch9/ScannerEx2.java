package ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) throws Exception {
		//파일명 경로 함께 지정
		Scanner sc = new Scanner(new File("C:\\java\\workspace\\javajungsuk\\src\\ch9\\data2.txt"));
		int sum = 0;
		int cnt = 0;
		
		while(sc.hasNext()) {
			sum += sc.nextInt();
			cnt++;
		}
		
		System.out.println("sum = "+sum);
		System.out.println("average = "+(double)sum/cnt);
	}

}
