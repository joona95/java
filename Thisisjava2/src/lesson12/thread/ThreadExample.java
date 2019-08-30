package lesson12.thread;

public class ThreadExample {

	public static void main(String[] args) {
		Thread thread1 = new MovieThread();
		thread1.start();
		
		//Runnable musicrun = new MusicRunnable();
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();

	}

}
