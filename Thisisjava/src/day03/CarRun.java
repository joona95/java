package day03;
import day04.*;
public class CarRun {

	public static void main(String[] args) {
		Car car1 = new Car();
		Tire tire = new Tire(4,"�ѱ�Ÿ�̾�");
		System.out.println("car1.company : "+car1.company);
		System.out.println("Ÿ�̾��� ���� : "+tire.tireNum);
		System.out.println("Ÿ�̾� ������ : "+tire.maker);
		
		Car car2 = new Car("�ڰ���");
		System.out.println("car2.company : "+car2.company);
		System.out.println("car2.model : "+car2.model);

		Car car3 = new Car("�ý�", "����", 200);
		System.out.println("car3.company : "+car3.company);
		System.out.println("car3.model : "+car3.model);
		System.out.println("car3.color : "+car3.color);
		System.out.println("car3.maxSpeed : "+car3.maxSpeed);
		
		
	}

}
