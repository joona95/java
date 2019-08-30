
public class EquilateralTriangle_2015311438 extends Triangle_2015311438{
	
	public EquilateralTriangle_2015311438(double[] sideLength) {
		super.setSideLength(sideLength);
	}

	@Override
	public boolean isValidTriangle() {
		
		boolean result = super.isValidTriangle();
		
		if(result==true)
		{
			if ((getSideLength()[0] == getSideLength()[1]) && (getSideLength()[1] != getSideLength()[2])) {
			System.out.println("Also, this is an equilateral triagle.");
				return true;
			}
			if ((getSideLength()[1] == getSideLength()[2]) && (getSideLength()[2] != getSideLength()[0])) {
			System.out.println("Also, this is an equilateral triagle.");
				return true;
			}
			if ((getSideLength()[0] == getSideLength()[2]) && (getSideLength()[2] != getSideLength()[1])) {
			System.out.println("Also, this is an equilateral triagle.");
				return true;
			}
			else {
			System.out.println("However, this is not an equilateral triagle");
				return false;
			}
		}
		else
			return false;
		
	}
}
