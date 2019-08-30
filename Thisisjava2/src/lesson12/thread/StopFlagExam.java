package lesson12.thread;

public class StopFlagExam {

	public static void main(String[] args) {
		PrintThread thread = new PrintThread();
		thread.start();
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		
		thread.setStop(true);
	}
	

}
