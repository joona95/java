package day04;

public class RectangleAreaClac {

	public static void main(String[] args) {
		Rectangle rec = new Rectangle();
		double result1 = rec.areaRectangle(10.5);
		double result2 = rec.areRectangle(10.5, 20.5);
		
		System.out.println("정사각형넓이 : "+result1);
		System.out.println("직사각형넓이 : "+result2);
	
	}

}
