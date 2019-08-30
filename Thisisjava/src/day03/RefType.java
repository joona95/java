package day03;

public class RefType {

	public static void main(String[] args) {
		String name1 = "ºò¹ð";
		String name2 = "ºò¹ð";
		String name3 = new String("ºò¹ð");
		
		boolean result1 = name1==name2;
		boolean result2 = name2==name3;
		boolean result3 = name1.equals(name3);
		System.out.println("result1 "+result1);
		System.out.println("result2 "+result2);
		System.out.println("result3 "+result3);

	}

}
