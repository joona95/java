package day04;

public class CarGSRun {

	public static void main(String[] args) {
		CarGS car = new CarGS();
		
		car.setSpeed(-50);
		System.out.println("현재 속도 : "+car.getSpeed());
		
		car.setSpeed(60);
		System.out.println("현재 속도 : "+car.getSpeed());
		
		if(!car.isStop()) {
			car.setStop(true);
		}
		
		System.out.println("현재 속도 : "+car.getSpeed());

	}

}
