package lesson12.thread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {
		//10�� ������ �ݺ� �߻�
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0;i<10;i++) {
			toolkit.beep();
			System.out.println("  ��");
			try {
				Thread.sleep(300);
			}catch(Exception e) { }
		}
	}
	

}
