import java.util.Scanner;
public class Main_2015311438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		Triangle_2015311438 t = new Triangle_2015311438();
		
		while(true) {
			System.out.println("---------Start Make Triangle---------");
			double s[] = new double[3];
			for (int i=0;i<3;i++) {
				System.out.print("Enter S"+(int)(i+1)+" : ");
				s[i] = scanner.nextDouble();
				
			}
			if(s[0]==0||s[1]==0||s[2]==0)
				break;
			
			t.setSideLength(s);
			t.area();
			t.printTriangleInfo();
			
			
			IsoscelesTriangle_2015311438 it = new IsoscelesTriangle_2015311438(t.getSideLength());
			it.isValidTriangle();
			
			EquilateralTriangle_2015311438 et = new EquilateralTriangle_2015311438(t.getSideLength());
			et.isValidTriangle();
			
			ScaleneTriangle_2015311438 st = new ScaleneTriangle_2015311438(t.getSideLength());
			st.isValidTriangle();
			
		}
		scanner.close();
		System.out.println("----------End Make Triangle----------");
	}

}
