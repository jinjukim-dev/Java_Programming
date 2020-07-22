package ch3;

public class Exercise3_7 {
	
	public static void main(String[] args) {
		int fahrenheit = 100;
		//float celcius = (int) ((5/9f * (fahrenheit - 32)) * 100 + 0.5) / 100.0f;
		
		float celcius = (int) (5/9f * (fahrenheit - 32) * 100 + 0.5) / 100f;
		
		System.out.println("Fahrentheit : "+fahrenheit);
		System.out.println("Celcius : "+celcius);
	}

}
