package day06;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] selectNum = new int[6];
		Random rand = new Random(3);
		System.out.println("���� ��ȣ: ");
		for(int i=0;i<6;i++) {
			selectNum[i] = rand.nextInt(45)+1;
			System.out.print(selectNum[i]+" ");
		}
		System.out.println();
		
		
		int[] winningNum = new int[6];
		System.out.println("��÷ ��ȣ: ");
		rand = new Random(3);
		for(int i=0;i<6;i++) {
			winningNum[i] = rand.nextInt(45)+1;
			System.out.print(winningNum[i]+" ");
		}
		System.out.println();
		
		
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.println("��÷ ����: ");
		if(result) {
			System.out.println("1� ��÷�ƽ��ϴ�.");
		}else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}

	}

}
