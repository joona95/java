package lesson12.thread;

public class JoinExam {

	public static void main(String[] args) {
		SumThread thread = new SumThread();
		thread.start();
		
		try {
			thread.join();
		}catch(InterruptedException e) {}
		System.out.println("1~100 гу : "+ thread.getSum());

	}

}
