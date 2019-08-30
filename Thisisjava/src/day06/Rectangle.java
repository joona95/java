package day06;

public class Rectangle extends Figure {
	public int width, height;
	
	
	public Rectangle(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	
	@Override
	public void area() {
		System.out.println("사각형의 면적: "+(width*height));
	}

}
