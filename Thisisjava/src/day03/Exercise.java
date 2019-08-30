package day03;

import java.util.Scanner;

public class Exercise {

	
	public static void main(String[] args) {
		//chap04
		
		boolean run = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1 : 
				System.out.print("예금액> ");
				balance += sc.nextInt();
				break;
			case 2 :
				System.out.print("출금액> ");
				int out = sc.nextInt();
				balance -= out;
				break;
			case 3 :
				System.out.println("잔고> "+balance);
				break;
			case 4 :
				run = false;
				break;
			default : 
				System.out.println("1~4번을 선택해주세요.");
			}
		}
		
		System.out.println("프로그램 종료");
		
		
		//chap05
		/*문제6번
		int[][] array = {
				{95,86},
				{83, 92, 96},
				{78,83, 93,87,88}
		};
		System.out.println(array.length);  //3
		System.out.println(array[2].length);  //5
		*/
		
		/*문제7번
		int max = 0;
		int[] array = {1,5,3,8,2};
		int min = array[0];
		
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : "+ max);
		
		for(int i=0;i<array.length;i++) {
			if(min>array[i]) {
				min = array[i];
			}
		}
		System.out.println("min : "+ min);
		*/
		
		/*문제8번
		int[][] array = {
				{95,86},
				{83,92,96},
				{78,83,93,87,88}
		};
		
		int sum = 0;
		double avg = 0.0;
		int arrlen = 0;
		
		for(int i =0;i<array.length;i++) {
			for(int k=0;k<array[i].length;k++) {
				sum += array[i][k];
				arrlen ++;
			}
		}
		avg = (double)sum / arrlen;
		
		System.out.println("sum: "+sum);
		System.out.println("avg: "+avg);
		*/
		
		
		
		
	}
	

}
