package day07;

public class ExeptionExam {

	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���� �Ű����� ���� �����մϴ�.");
			System.out.println("[���� ���]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			return;
		}finally {
			System.out.println("args[0]:"+data1);
			System.out.println("args[1]:"+data2);
		}
		
		


	}

}
