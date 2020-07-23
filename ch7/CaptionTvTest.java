package ch7;

class Tv{
	boolean power; //전원상태 (on/off)
	int channel; //채널
	
	void power() { power = !power; }
	void channeUp() {++channel;}
	void channelDown() {--channel;}
}

class CaptionTv extends Tv{
	boolean caption; //기본값 false
	
	void displayCaption(String text) {
		if(caption) { //caption == true
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; //CaptionTv가 Tv를 상속받고 있기 떄문에 Tv클래스 멤버 변수 사용 가능
		ctv.channeUp(); //Tv클래스 메서드도 사용 가능 ctv.channel = 11
		System.out.println(ctv.channel); //11
		ctv.displayCaption("Hello world!"); //displayCaption 메서드에서 caption값이 기본값 false라서 출력 x
		ctv.caption = true;
		ctv.displayCaption("Hello world!"); //출력해줌
	}
}
