/*package ch12;

import java.util.*;

class Fruit implements Eatable {public String toString() {return "Fruit";}}
class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy {public String toString() {return "Toy";}}

interface Eatable{}

public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box<Fruit> fruitBox = new Box<Fruit>();
		Box<Apple> appleBox = new Box<Apple>();
		
		Box<Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
		
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(toyBox);
		System.out.println("===========================");
		
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox -> "+ fruitBox);
		System.out.println("appleBox -> "+ appleBox);
		System.out.println("GrapeBox -> "+ grapeBox);
				
	}

}

class FruitBox<T extends Fruit & Eatable> extends Box<T>{}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();
	void add(T item) {list.add(item);}
	T get(int i) {return list.get(i);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
}
*/