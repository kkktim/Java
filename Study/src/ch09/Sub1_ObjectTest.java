package ch09;
/*
 * ��¥ : 2022/01/10
 * �̸� : ����ȣ
 * ���� : �ڹ� Object ����Ŭ���� �ǽ� ���� p284
 */
public class Sub1_ObjectTest {
	
	public static void main(String[] args) {
		
		// �ڹ��� �ֻ��� Ŭ���� Object�� ��ĳ����(������)
		Object apple = new Apple("�ѱ�", 5000);
		Banana banana = new Banana("�Ϻ�", 3000);
		
		apple.toString();
		banana.toString();
		
	}

}
