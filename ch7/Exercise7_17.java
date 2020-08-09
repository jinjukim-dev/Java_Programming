package ch7;

abstract class Unit{
	int x, y ;
	abstract void move(int x, int y);
	void stop() {}
	
}

class Marine extends Unit{
	
	void stimPack() {}

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}

class Tank extends Unit{
	int x, y;
	void changeMode() {}
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}

class Dropship extends Unit{
	int x, y;
	void load() {}
	void unload() {}
	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		
	}
}

public class Exercise7_17 {

}
