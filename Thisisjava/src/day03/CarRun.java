package day03;
import day04.*;
public class CarRun {

	public static void main(String[] args) {
		Car car1 = new Car();
		Tire tire = new Tire(4,"한국타이어");
		System.out.println("car1.company : "+car1.company);
		System.out.println("타이어의 개수 : "+tire.tireNum);
		System.out.println("타이어 제조사 : "+tire.maker);
		
		Car car2 = new Car("자가용");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);

		Car car3 = new Car("택시", "검정", 200);
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println("car3.maxSpeed : "+car3.maxSpeed);
		
		
	}

}
