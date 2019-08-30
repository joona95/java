package day02;

public class Operator {

	public static void main(String[] args) {
		
		byte var1 = 125;
		int var2 = 125;
		for(int i=0;i<5;i++) {
			var1++;
			var2++;
			System.out.println("var1: "+var1+"\t"+"var2: "+var2);
		}
		
		//문자열 연결 연산자
		String str1 = "JDK" + 6.0;
		String str2 = str1 + "특징";
		System.out.println(str2);
		
		String str3 = "JDK" + 3 + 3.0;
		String str4 = 3 + 3.0 + "JDK";
		System.out.println(str3);
		System.out.println(str4);
		
		
		//비트 반전 연산자
		long v1 = 1000000L;
		long v2 = 1000000L;
		long z = v1 * v2;
		System.out.println(z);
		
		
		
		/*
		boolean play = true;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		
		play = !play;
		System.out.println(play);
		*/
		
		
		/*
		int x= 1;
		int y= 1;
		int res1 = ++x + 10;
		int res2 = y++ + 10;
		
		System.out.println("res1: " + res1 + ", res2: " + res2);
		System.out.println("x: "+x+", y: "+y);
		*/
		
		
		/*
		int num1 = 3 - 1 / 2;
		double num2 = 2.1 +1.5 * 2.0;
		int num3 = 2 * 5 /3;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		*/
	}

}
