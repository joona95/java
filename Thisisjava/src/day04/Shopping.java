package day04;

class Purse {
	static int balance;
	//int balance;
	void printMoney(int in, int out) {
		balance = balance + in - out;
		if(balance <0) {
			System.out.println((-1*balance)+"�� �����մϴ�.");
		}else {
			System.out.println("�ܾ��� "+balance+"���Դϴ�.");
		}
	}
}

public class Shopping {

	public static void main(String[] args) {
		Purse store1 = new Purse();
		store1.printMoney(100000, 20000);
		Purse store2 = new Purse();
		store2.printMoney(0, 50000);
	}

}
