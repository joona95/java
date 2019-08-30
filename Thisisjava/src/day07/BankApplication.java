package day07;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("---------------------------------------");
			System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
			System.out.println("---------------------------------------");
			System.out.print("����> ");
			
			int selectNo = sc.nextInt();
			
			if(selectNo == 1) {
				createAccount();
			}else if(selectNo ==2) {
				accountList();
			}else if(selectNo ==3) {
				deposit();
			}else if(selectNo ==4) {
				withdraw();
			}else if(selectNo ==5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");
	}
	
	
	private static void createAccount() {
		System.out.println("---------------");
		System.out.println("���»���");
		System.out.println("---------------");
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();
		System.out.print("������: ");
		String owner = sc.next();
		System.out.print("�ʱ��Աݾ�: ");
		int balance = sc.nextInt();
		Account account = new Account(ano, owner, balance);
		
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i] = account;
				System.out.println("���: ���°� �����Ǿ����ϴ�.");
				break;
			}
		}
		
	}
	
	private static void accountList() {
		System.out.println("---------------");
		System.out.println("���¸��");
		System.out.println("---------------");
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				Account account = accountArray[i];
				System.out.println(account.getAno()+"   "+account.getOwner()+"     "+account.getBalance());
			}
		}
	}
	
	private static void deposit() {
		System.out.println("---------------");
		System.out.println("����");
		System.out.println("---------------");		
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();
		System.out.print("���ݾ�: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("���: ������ �����Ǿ����ϴ�.");
	}
	
	private static void withdraw() {
		System.out.println("---------------");
		System.out.println("���");
		System.out.println("---------------");	
		System.out.print("���¹�ȣ: ");
		String ano = sc.next();
		System.out.print("��ݾ�: ");
		int money = sc.nextInt();
		Account account = findAccount(ano);
		if(account==null) {
			System.out.println("���: ���°� �����ϴ�.");
			return;
		}
		account.setBalance(account.getBalance()-money);
		System.out.println("���: ����� �����Ǿ����ϴ�.");
	}
	
	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0;i<accountArray.length;i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno();
				if(dbAno.equals(ano)) {
					account = accountArray[i];
					break;
				}
			}

		}
		return account;
		
	}

}
