
public class ScaleneTriangle_2015311438 extends Triangle_2015311438{
	
	public ScaleneTriangle_2015311438(double[] sideLength) {
		super.setSideLength(sideLength);
	}

	@Override
	public boolean isValidTriangle() {
		
		boolean result = super.isValidTriangle();
		
		if(result ==true)
		{
		if ((getSideLength()[0] == getSideLength()[1]) && (getSideLength()[1] != getSideLength()[2])) {
			System.out.println("Also, this is an scalene triagle.");
			return true;
			}
		if ((getSideLength()[1] == getSideLength()[2]) && (getSideLength()[2] != getSideLength()[0])) {
			System.out.println("Also, this is an scalene triagle.");
			return true;
			}
		if ((getSideLength()[0] == getSideLength()[2]) && (getSideLength()[2] != getSideLength()[1])) {
			System.out.println("Also, this is an scalene triagle.");
			return true;
			}
		else {
			System.out.println("However, this is not an scalene triagle");
			return false;
		}
		}
		else
			return false;
	}
}
