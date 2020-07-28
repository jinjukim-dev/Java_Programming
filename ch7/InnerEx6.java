package ch7;

import java.awt.*;
import java.awt.event.*;

public class InnerEx6 {
	
	public static void main(String[] args) {
		Button b = new Button("Start");
		//b.addActionListener(new EventHandler());
		
		//익명클래스로 표현했을떄
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
				
			}
		});
	}
	
	//익명클래스
	Object iv = new Object() {
		void method() {}
	};
	
	static Object cv = new Object() { void method() {} };
	
	void myMehthod() {
		Object lv = new Object() {void method(){}};
	}
	
}

/*class EventHandler implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!!");
		
	}
}*/
