package day01;

public class BooleanExample {

	public static void main(String[] args) {
		byte a = 2, b=3;
		int sum = a + b; //자동형변환 int <= byte
		//sum = (byte)(a + b); //강제형변환(캐스트 연산)
		System.out.println(sum);
		
		/*
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		*/
		
	}

}
