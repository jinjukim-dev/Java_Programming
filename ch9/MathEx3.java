package ch9;

import static java.lang.Math.*;
import static java.lang.System.*;

public class MathEx3 {
	public static void main(String[] args) {
		int x1=1, y1=1;
		int x2=2, y2=2;
		
		double c = sqrt(pow(x2-x1, 2) + pow(y2-y1, 2));
		double a = c * sin(PI/4); // PI/4 rad = 45 degree
		double b = c * cos(PI/4);
	}

}
