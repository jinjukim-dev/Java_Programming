package ch7;

class CDPlayer extends Player{
	
	 int currentTrack;
	 
	 CDPlayer() {
		 currentTrack = 0;
	 }
	
	//Play class 추상메서드 구현
	@Override
	void play(int pos) {
		System.out.println("CDPlay play()");
		
	}

	@Override
	void stop() {
		System.out.println("CDPlay stpo()");
		
	}
	
	//새롭게 CDPlayer에서 추가된 메서드
	void nextTrack() {
		currentTrack++;
	}
	
	void preTrack() {
		if(currentTrack > 1)
			currentTrack--;
	}
	
}

public class AbstractTest1{
	
	public static void main(String[] args) {
		CDPlayer cdp = new CDPlayer();
		cdp.play(60);
		cdp.stop();
	}

}
