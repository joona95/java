package day06;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		int[] selectNum = new int[6];
		Random rand = new Random(3);
		System.out.println("선택 번호: ");
		for(int i=0;i<6;i++) {
			selectNum[i] = rand.nextInt(45)+1;
			System.out.print(selectNum[i]+" ");
		}
		System.out.println();
		
		
		int[] winningNum = new int[6];
		System.out.println("당첨 번호: ");
		rand = new Random(3);
		for(int i=0;i<6;i++) {
			winningNum[i] = rand.nextInt(45)+1;
			System.out.print(winningNum[i]+" ");
		}
		System.out.println();
		
		
		Arrays.sort(selectNum);
		Arrays.sort(winningNum);
		boolean result = Arrays.equals(selectNum, winningNum);
		System.out.println("당첨 여부: ");
		if(result) {
			System.out.println("1등에 당첨됐습니다.");
		}else {
			System.out.println("당첨되지 않았습니다.");
		}

	}

}
