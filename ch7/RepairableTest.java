package ch7;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.*;

public class RepairableTest {
	public static void main(String[] args) {
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		
		Marine marine = new Marine();
		
		SCV scv = new SCV();
		scv.repair(tank);
		scv.repair(dropship);
		//scv.repair(marine); 에러 marine은 Repairable 인터페이스를 구현하지 않았으므로 컴파일 에러
	}

}
interface Repairable{}

class GroundUnit extends Unit{
	GroundUnit(int hp) {
		super(hp);
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class Unit{
	int hitPoint; //현재 체력
	final int MAX_HP; //최고 체력
	
	Unit(int hp){
		MAX_HP = hp;
	}
	
}

class Tank extends GroundUnit implements Readable{
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	public String toString() {
		return "Tank";
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

}

class Dropship extends AirUnit implements Readable{

	Dropship() {
		super(125);
		hitPoint = MAX_HP;
		
	}
	
	@Override
	public String toString() {
		return "Dropship";
	}

	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

class Marine extends GroundUnit{

	Marine() {
		super(40);
		hitPoint = MAX_HP;	
	}
	
	@Override
	public String toString() {
		return "Marine";
	}
	
}

class SCV extends GroundUnit implements Readable{

	SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Readable r) {
		if(r instanceof Unit) {
			Unit u = (Unit) r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u.toString()+"의 수리가 끝났습니다.");
		}
		
	}
	
}

