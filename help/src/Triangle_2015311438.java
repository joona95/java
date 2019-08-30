
public class Triangle_2015311438 implements Shape_2015311438{
	
	private double side_length[];//3 Length of  side
	protected double area;
	
	
	@Override
	public void area() {
		//root 해서 면적 계산 식
		double a = this.getSideLength()[0];
		double b = this.getSideLength()[1];
		double c = this.getSideLength()[2];
		this.area = Math.sqrt(((a+b+c)/2)*((b+c-a)/2)*((a+b-c)/2)*((a+c-b)/2));
		
	}
	
	public void setSideLength(double s[]) {//매개변수
		//for(int i = 0;i<3;i++) {
			//System.out.println("S"+(int)(i)+" : "+ s[i]);
		//별다른거 안해줘도 이미 들어간듯.
		this.side_length = s;
		
	}
	
	public double[] getSideLength() {
		return side_length;//getter함수. private 필드는 다른 등변삼각형 클래스에서 접근을 못하니까 
	}
	
	public boolean isValidTriangle() {
		
		if ((getSideLength()[0] >= getSideLength()[1]) && (getSideLength()[0] >=getSideLength()[2]) && (getSideLength()[0] < (getSideLength()[1]+getSideLength()[2]))) {
			System.out.println("This is a triangle");
			return true;
			}
		if ((getSideLength()[1] >= getSideLength()[2]) && (getSideLength()[1] >=getSideLength()[0]) && (getSideLength()[1] < (getSideLength()[0]+getSideLength()[2]))) {
			System.out.println("This is a triangle");
			return true;
			}
		if ((getSideLength()[2] >= getSideLength()[1]) && (getSideLength()[2] >=getSideLength()[0]) && (getSideLength()[2] < (getSideLength()[1]+getSideLength()[0]))){
			System.out.println("This is a triangle");
			return true;
			}
		else {
			System.out.println("This is not a triangle");
			return false;
			}
	}
	
	public void printTriangleInfo() {
		
		System.out.println("------Triangle Info-------");
		for(int i = 0;i<3;i++) {
			System.out.println("S"+(int)(i)+" : "+ getSideLength()[i]);
		}
		System.out.println("Area : "+ this.area);
		System.out.println("--------------------------");
		
		
		
		//EquilateralTriangle_2015311438.isValidTriangle();
		//child 이등변, 정삼각혁, 부등삼각형에서 type casting한 값을 넣어야함
	}

	/*public double[] getSide_length() {
		return side_length;
	}

	public void setSide_length(double side_length[]) {
		this.side_length = side_length;
	}*/
}
	
