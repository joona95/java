package day04;

public class CarGasRun {

	public static void main(String[] args) {
		CarGas car = new CarGas();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�.");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}

	}

}
