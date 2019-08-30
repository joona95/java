package day02;

public class Ifelseswitch {

	public static void main(String[] args) {
		String position = "과장";
		
		switch(position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
		}
		
		
		
		//double r1 = Math.random();
		//int r2 = (int) Math.random();
		//int coin = (int)(Math.random()*2)+1;
		//int dice = (int)(Math.random()*6)+1;
		
		
		/*
		if(dice ==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(dice==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(dice==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(dice==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(dice==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		*/
		
		/*
		switch(dice) {
		case 1: 
			System.out.println("1번이 나왔습니다.");
			break;
		case 2: 
			System.out.println("2번이 나왔습니다.");
			break;
		case 3: 
			System.out.println("3번이 나왔습니다.");
			break;
		case 4: 
			System.out.println("4번이 나왔습니다.");
			break;
		case 5: 
			System.out.println("5번이 나왔습니다.");
			break;
		default: 
			System.out.println("6번이 나왔습니다.");
			break;
		}
		*/
		
	}

}
