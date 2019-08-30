package day02;

import java.util.Scanner;

public class Forwhile {

	public static void main(String[] args) {
		System.out.println("메시지를 입력하세요~");
		System.out.println("프로그램 종료 q 입력");
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while(!inputString.equals("q"));
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		
		//int sum = 0;
		//int i=1;
		
		/*
		for(i=1;i<=10;i++) {
			sum += i;
			System.out.print(i + " ");
		}*/
		
		
		/*
		while(i<=10) {
			sum +=i;
			System.out.print(i + " ");
			i++;
		}
		
		System.out.println();
		System.out.println("1~"+(i-1)+"합 : "+sum);
		*/
	}

}
