package day06;

public class Circle extends Figure {
	public int radius;
	//static final double PI = 3.14;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void area() {
		System.out.println("원의 면적: "+(Math.PI*radius*radius));
	}

}
