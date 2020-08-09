package ch7;

class MyTv2{
	private boolean inPowerOn;
	private int channel;
	private int volume;
	private int prevChannel; //이전 채널
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 10;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	public boolean isInPowerOn() {
		return inPowerOn;
	}
	public void setInPowerOn(boolean inPowerOn) {
		this.inPowerOn = inPowerOn;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		prevChannel = this.channel;
		this.channel = channel;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	//7_11
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	

}

public class Exercise7_10 {
	public static void main(String[] args) {
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH : "+t.getChannel());
		//t.setVolume(20);
		//System.out.println("VOL : "+t.getVolume());
		t.setChannel(20);
		System.out.println("CH : "+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH : "+t.getChannel()); //10
		t.setChannel(20);
		System.out.println("CH : "+t.getChannel());
	}

}
