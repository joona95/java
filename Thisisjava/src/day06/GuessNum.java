package day06;

import java.util.*;

public class GuessNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int com = rand.nextInt(30)+1;
		System.out.println("숫자를 입력(1~30) : ");
		
		while(true) {
			int num = sc.nextInt();
			if(com==num) {
				System.out.println("맞음");
				break;
			}else if(com<num){
				System.out.println("너무 커요");
			}else {
				System.out.println("너무 작아요");
			}
		}


	}

}
