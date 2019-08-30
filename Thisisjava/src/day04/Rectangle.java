package day04;

public class Rectangle {
	//생성자 
	Rectangle(){
		
	}
	
	//<메소드 오버로딩>
	//정사각형 넓이 메소드
	double areaRectangle(double width) {
		return width*width;
	}
	//직사각형 넓이 메소드
	double areRectangle(double width, double height) {
		return width*height;
	}

}
