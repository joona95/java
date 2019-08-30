package day03;

public class NewArray {

	public static void main(String[] args) {
		int[][] mathScores = new int[2][3];
		for(int i=0;i<mathScores.length;i++) {
			for(int k=0;k<mathScores[i].length;k++) {
				System.out.println("mathScores["+i+"]["+k+"] = "+mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishScores = new int[2][];
		englishScores[0] = new int[2];
		englishScores[1] = new int[3];
		for(int i=0;i<englishScores.length;i++) {
			for(int k=0;k<englishScores[i].length;k++) {
				System.out.println("englishScores["+i+"]["+k+"] = "+englishScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] javaScores = { {95,80}, {92,96,80}};
		for(int i=0;i<javaScores.length;i++) {
			for(int k=0;k<javaScores[i].length;k++) {
				System.out.println("javaScores["+i+"]["+k+"] = "+javaScores[i][k]);
			}
		}
		
		
		/*
		int[][] scores = new int[2][];
		scores[0]= new int[2];
		scores[1]= new int[3];
		
		System.out.println(scores[0].length);
		System.out.println(scores[1].length);
		System.out.println(scores.length);
		*/
		
		
		/*
		int[] arr1 = new int[3];
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		for(int i=0;i<arr1.length;i++) {
			System.out.println("arr1["+i+"] : "+arr1[i]);
		}
		
		double[] arr2 = new double[3];
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		arr2[0]=0.1;
		arr2[1]=0.2;
		arr2[2]=0.3;
		for(int i=0;i<arr2.length;i++) {
			System.out.println("arr2["+i+"] : "+arr2[i]);
		}
		
		String[] arr3 = new String[3];
		for(int i=0;i<arr3.length;i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		arr3[0] = "1¿ù";
		arr3[1] = "2¿ù";
		arr3[2] = "3¿ù";
		for(int i=0;i<arr3.length;i++) {
			System.out.println("arr3["+i+"] : "+arr3[i]);
		}
		*/
	}

}
