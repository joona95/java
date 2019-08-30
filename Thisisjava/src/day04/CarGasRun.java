package day04;

public class CarGasRun {

	public static void main(String[] args) {
		CarGas car = new CarGas();
		
		car.setGas(5);
		
		boolean gasState = car.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			car.run();
		}
		
		if(car.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}

	}

}
