package ch3;

public class Exercise3_2 {
	
	public static void main(String[] args) {
		int numOfApples = 123;
		int sizeOfBucket = 10;
		
		//int numOfBucket = numOfApples / sizeOfBucket;
		//if(numOfApples % sizeOfBucket > 0) ++numOfBucket;
		
		//int numOfBucket = 
		//		numOfApples % sizeOfBucket > 0 ? (numOfApples / sizeOfBucket)+1 : numOfApples / sizeOfBucket;
		
		int numOfBucket = 
				numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket > 0 ? 1 : 0);
		
		System.out.println(numOfBucket);
	}

}
