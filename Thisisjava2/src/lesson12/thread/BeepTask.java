package lesson12.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		//10번 비프음 반복 발생
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			toolkit.beep();
			System.out.println("  가");
			try {
				Thread.sleep(300);
			}catch(Exception e) { }
		}
	}
	

}
