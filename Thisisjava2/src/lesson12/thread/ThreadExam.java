package lesson12.thread;

import java.awt.Toolkit;

public class ThreadExam {

	public static void main(String[] args) {
		Runnable beeptask = new BeepTask();
		Thread thread = new Thread(beeptask);
		thread.start();

		
		//"��" ���� 0.3�� �������� 10�� �ݺ� ���
		for(int i=0;i<10;i++) {
			System.out.println("��");
			try {
				Thread.sleep(300);
			}catch(Exception e) { }
		}

	}

}
