package day03;
import day04.*;
public class C {
	public C() {
		A a = new A();
		a.field1 = 1;
		//a.field2 = 1;  //default �ʵ� ���ٺҰ�
		//a.field3 = 1;  //private �ʵ� ���ٺҰ�
		
		a.method1();
		//a.method2();  //default �޼ҵ� ���ٺҰ�
		//a.method3();  //private �޼ҵ� ���ٺҰ�
	}

}
