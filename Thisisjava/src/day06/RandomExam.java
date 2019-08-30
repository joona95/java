package day06;

import java.util.Random;

public class RandomExam {

	public static void main(String[] args) {
	
	
		Random rand = new Random();
		
		int dice = rand.nextInt(6)+1;
		System.out.println(dice);
	
		
		
		/*
		int num = (int)(Math.random()*6)+1;
		System.out.println(num);
		
		int num2= (int)(Math.random()*45)+1;
		System.out.println(num2);
		*/
	}

}
