package ch7;

class Aclass{
	void autoPlay(I i) {
		i.play();
	}
}

interface I{
	public abstract void play();
}

class Bclass implements I{

	@Override
	public void play() {
		System.out.println("play in B class");		
	}
	
}

class Cclass implements I{

	@Override
	public void play() {
		System.out.println("play in C class");
	}
	
}

public class InterfaceTest2 {
	public static void main(String[] args) {
	
		Aclass a = new Aclass();
		a.autoPlay(new Bclass());
		a.autoPlay(new Cclass());
	}

}
