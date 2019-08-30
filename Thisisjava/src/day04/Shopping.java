package day04;

class Purse {
	static int balance;
	//int balance;
	void printMoney(int in, int out) {
		balance = balance + in - out;
		if(balance <0) {
			System.out.println((-1*balance)+"원 부족합니다.");
		}else {
			System.out.println("잔액은 "+balance+"원입니다.");
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
