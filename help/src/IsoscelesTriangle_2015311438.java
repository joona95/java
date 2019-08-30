
public class IsoscelesTriangle_2015311438 extends Triangle_2015311438 {
	
	public IsoscelesTriangle_2015311438(double[] sideLength) {
		super.setSideLength(sideLength);
	}

	@Override
	public boolean isValidTriangle() {
		
		boolean result = super.isValidTriangle();
		
		if(result ==true)
		{
		if ((getSideLength()[0] == getSideLength()[1]) && (getSideLength()[1] != getSideLength()[2])) {
			System.out.println("Also, this is an isosceles triagle.");
			return true;
			}
		if ((getSideLength()[1] == getSideLength()[2]) && (getSideLength()[2] != getSideLength()[0])) {
			System.out.println("Also, this is an isoscles triagle.");
			return true;
			}
		if ((getSideLength()[0] == getSideLength()[2]) && (getSideLength()[2] != getSideLength()[1])) {
			System.out.println("Also, this is an isoscles triagle.");
			return true;
			}
		else {
			System.out.println("However, this is not an isoscles triagle");
			return false;
		}
		}
		else
			return false;
		
	}
}
