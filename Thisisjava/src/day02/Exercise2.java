package day02;

public class Exercise2 {

	public static void main(String[] args) {
		
		/*����3��
		int sum=0;
		int i;
		for(i=1;i<=100;i++) {
			if(i%3==0) {
				sum += i;
			}else {
				continue;
			}
		}
		System.out.println("3�� ��� ���� : "+sum);
		*/
		
		while(true) {
		int num1 = (int)(Math.random()*6)+1;
		int num2 = (int)(Math.random()*6)+1;
		System.out.println("("+num1+", "+num2+")");
		if((num1+num2)==5) {
			break;
		}
		
		}
		
		
		/*����6��
		for(int i=0;i<5;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
	}

}
