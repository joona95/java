package day01;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����� �̸��� : ");
		String name = sc.next();
		System.out.println("����� ���̴� : ");
		int age = sc.nextInt();
		System.out.println("�̸��� " + name+ "�̰�, ���̴� " + age );
		
		sc.close();
	}

}
