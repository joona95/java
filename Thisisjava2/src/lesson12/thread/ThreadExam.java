package lesson12.thread;

import java.awt.Toolkit;

public class ThreadExam {

	public static void main(String[] args) {
		Runnable beeptask = new BeepTask();
		Thread thread = new Thread(beeptask);
		thread.start();

		
		//"띵" 글자 0.3초 간격으로 10번 반복 출력
		for(int i=0;i<10;i++) {
			System.out.println("띵");
			try {
				Thread.sleep(300);
			}catch(Exception e) { }
		}

	}

}
