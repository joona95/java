package day06;

import java.util.*;

public class GuessNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int com = rand.nextInt(30)+1;
		System.out.println("���ڸ� �Է�(1~30) : ");
		
		while(true) {
			int num = sc.nextInt();
			if(com==num) {
				System.out.println("����");
				break;
			}else if(com<num){
				System.out.println("�ʹ� Ŀ��");
			}else {
				System.out.println("�ʹ� �۾ƿ�");
			}
		}


	}

}
