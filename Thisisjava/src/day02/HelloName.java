package day02;

public class HelloName {
	/*
	public static void Hello(String name) {
		System.out.println("Hello "+name);
	}
	*/
	
	
	
	public static void main(String[] args) {
		int score = 85;
		char grade = (score>90) ? 'A' : ( (score>80) ? 'B' : 'C' );
		System.out.println(score+"���� "+grade +"����Դϴ�.");
		
		
		
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		System.out.println(toBinaryString(v1) + " (������ : " + v1 + ")");		
		System.out.println(toBinaryString(v2) + " (������ : " + v2 + ")");
		System.out.println(toBinaryString(v3) + " (������ : " + v3 + ")");
		System.out.println();
		
	}
	
	
	public static String toBinaryString(int value) {
		String str = Integer.toBinaryString(value);
		while(str.length() < 32) {
			str = "0"+str;
		}
		return str;
		
	}
	
}

