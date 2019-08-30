
public class Triangle_2015311438 implements Shape_2015311438{
	
	private double side_length[];//3 Length of  side
	protected double area;
	
	
	@Override
	public void area() {
		//root �ؼ� ���� ��� ��
		double a = this.getSideLength()[0];
		double b = this.getSideLength()[1];
		double c = this.getSideLength()[2];
		this.area = Math.sqrt(((a+b+c)/2)*((b+c-a)/2)*((a+b-c)/2)*((a+c-b)/2));
		
	}
	
	public void setSideLength(double s[]) {//�Ű�����
		//for(int i = 0;i<3;i++) {
			//System.out.println("S"+(int)(i)+" : "+ s[i]);
		//���ٸ��� �����൵ �̹� ����.
		this.side_length = s;
		
	}
	
	public double[] getSideLength() {
		return side_length;//getter�Լ�. private �ʵ�� �ٸ� ��ﰢ�� Ŭ�������� ������ ���ϴϱ� 
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
		//child �̵, ���ﰢ��, �ε�ﰢ������ type casting�� ���� �־����
	}

	/*public double[] getSide_length() {
		return side_length;
	}

	public void setSide_length(double side_length[]) {
		this.side_length = side_length;
	}*/
}
	
