package day05;

public class ChildExam {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2();  //�����ǵǾ� ȣ�� ����
		//parent.method3();
		child.method1();
		child.method2();
		child.method3();
	}

}
