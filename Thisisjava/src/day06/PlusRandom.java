package day06;

import java.util.*;

public class PlusRandom {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int num1 = rand.nextInt(30)+1;
			int num2 = rand.nextInt(30)+1;
			int sum = num1+num2;
			System.out.println(num1+"+"+num2+"=");
			int guess = sc.nextInt();
			if(guess==sum) {
				System.out.println("����� õ��!");
			}else {
				System.out.println("����� �ٺ�!");
			}
		}
		

		

	}

}
