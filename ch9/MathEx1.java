package ch9;

public class MathEx1 {
	public static void main(String[] args) {
		double val = 90.7552;
		System.out.println("round("+val+") = "+Math.round(val)); //반올림
		
		val *= 100; //9075.52
		System.out.println("round("+val+") = "+Math.round(val)); //반올림
		
		System.out.println("round("+val+")/100 = "+Math.round(val)/100);
		System.out.println("round("+val+")/100.0 = "+Math.round(val)/100.0);
		System.out.println();
		//%3.1f = 소수점 두번째자리에서 반올림하여 1자리까지 표현
		System.out.printf("ceil(%3.1f)=%3.1f%n", 1.1, Math.ceil(1.1)); //올림
		System.out.printf("floor(%3.1f)=%3.1f%n", 1.1, Math.floor(1.1)); //버림
		System.out.printf("round(%3.1f)=%d%n", 1.1, Math.round(1.1)); //반올림
		System.out.printf("round(%3.1f)=%d%n", 1.5, Math.round(1.5)); //반올림
		System.out.printf("rint(%3.1f)=%3.1f%n", 1.1, Math.rint(1.1)); //반올림
		System.out.println("음수일떄");
		System.out.printf("round(%3.1f)=%d%n", -1.5, Math.round(-1.5)); //5이하 반올림 -1 (5포함)
		System.out.printf("rint(%3.1f)=%3.1f%n", -1.5, Math.rint(-1.5)); //5미만 일떄 -1 (5포함 x)
		System.out.printf("ceil(%3.1f)=%3.1f%n", -1.5, Math.ceil(-1.5)); //올림 -1
		System.out.printf("floor(%3.1f)=%3.1f%n", -1.5, Math.floor(-1.5)); //버림 -2
		
		
	}


}
