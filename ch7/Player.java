package ch7;

abstract class Player {
	
	boolean pause;	//일시정지 상태를 저정하기 위한 변수
	int currentPos; //현재 play되고 있는 위치를 저장하기 위한 변수
	
	Player(){
		pause = false;
		currentPos = 0;
	}
	
	//추상메서드
	abstract void play(int pos);
	abstract void stop();
	
	//추사메서드 사용
	void play(){
		play(currentPos);
	}
	
	//일시정지 메서드
	void pause() {
		if(pause) {
			pause = false;
			play(currentPos);
		}else {
			pause = true;
			stop();
		}
	}

}
