package day04;

public class CalculatorRun {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.powerOn();
		
		int sum = calc.plus(5, 10);
		System.out.println("ÇÕ°è´Â : "+sum);
		
		double result = calc.divide(10, 4);
		System.out.println("¸òÀº : "+ result);
		
		calc.powerOff();
	}

}
