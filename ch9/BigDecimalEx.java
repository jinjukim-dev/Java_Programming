package ch9;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalEx {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("123.456");
		BigDecimal bd2 = new BigDecimal("1.0");
		
		System.out.print("bd1 = "+bd1);
		System.out.print(",\tvalue = "+bd1.unscaledValue());
		System.out.print(",\t\tscale = "+bd1.scale());
		System.out.print(",\tprecision = "+bd1.precision());
		System.out.println();
		
		System.out.print("bd2 = "+bd2);
		System.out.print(",\tvalue = "+bd2.unscaledValue());
		System.out.print(",\t\tscale = "+bd2.scale());
		System.out.print(",\tprecision = "+bd2.precision());
		System.out.println();
		
		BigDecimal bd3 = bd1.multiply(bd2);
		System.out.print("bd3 = "+bd3);
		System.out.print(",\tvalue = "+bd3.unscaledValue());
		System.out.print(",\tscale = "+bd3.scale());
		System.out.print(",\tprecision = "+bd3.precision());
		System.out.println();
		
		System.out.println(bd1.divide(bd2, 2, RoundingMode.HALF_UP));
		System.out.println(bd1.setScale(2, RoundingMode.HALF_UP));
		System.out.println(bd1.divide(bd2, new MathContext(3, RoundingMode.HALF_UP)));
		//MathContext에서 precision이 정수와 소수점 이하를 모두 포함한 자리수를 의미한다.
		
		
	}

}
