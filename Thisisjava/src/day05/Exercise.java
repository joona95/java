package day05;

public class Exercise {

	public static void main(String[] args) {
		//String[] arr = {"John", "Kim"};
		String[] arr=null;
		arr=new String[] {"John", "Kim"};
		System.out.println(arr[0]+" "+arr[1]);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr.length);
		
		
		//!((b==0) || (b==1))
		//(b!=0) && (b!=1)
		
		//byte 1byte -2^7~2^7-1
		//int 4byte -2^31 ~ 2^31-1
		//long 8byte -2^63 ~ 2^63-1
	}
	

}
