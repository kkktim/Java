package ch09;

interface Animal {
	void sleep();
}

class Eagle implements Animal {

	@Override
	public void sleep() {
		System.out.println("���� �ܴ�.");
	}
	
	public void eat() {
		System.out.println("�Դ´�.");
	}
	
}

public class P241 {
	public static void main(String[] args) {
		
		Animal eagle = new Eagle();
		
		eagle.sleep();
//		eagle.eat(); ����
		
		Eagle eagleObj = (Eagle)eagle;  // ���� ����ȯ
		eagleObj.eat();   // Eagle Ŭ������ eat() �޼���
		
		
	}

}
