package Exercise;

import java.util.*;
import java.text.*;
import java.awt.*;
import java.awt.event.*;

import Exercise.Exercise13_1.MyEventHandler;

public class Exercise13_4 extends Frame{

	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
		
	public static void main(String[] args) {
		Exercise13_4 win = new Exercise13_4();
		win.start();
	}
	
	Exercise13_4(){
		super("");
		
		MyEventHandler handler = new MyEventHandler();
		addWindowListener(handler);
		
		setBounds(500, 200, 200, 0);
		updateClock();
		setResizable(false);
		setVisible(true); 
	}
	
	void updateClock() { // 현재시간을 Frame의 title에 표시하는 메서드
		Date currentTime = new Date(System.currentTimeMillis());
		setTitle(sdf.format(currentTime));
	}
	
	void start(){ // 쓰레드 이용 1초마다 updateClock()호출
		Thread t = new Thread(new Runnable() {
			public void run(){
				while(true) {
					try {
						Thread.sleep(1000); // 1초 쉰다.
					} catch(Exception e){}
					
					updateClock(); // updateClock() 호출
				}
			} // run()
		});
		t.start();
	}
	
	class MyEventHandler extends WindowAdapter {
		public void windowClosing(WindowEvent e){
			e.getWindow().setVisible(false);
			e.getWindow().dispose();
			System.exit(0);
		}
	} // MyEventhandler
}
