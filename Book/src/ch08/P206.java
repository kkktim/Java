package ch08;

public class P206 {
	
	public static void main(String[] args) {
		
		Child206 c = new Child206();
		
		c.run();
		
		// �θ�Ŭ������ �ڷ������� ���� (�ڵ�����ȯ)
		Parent206 p = new Child206();
		p.run();   // ������ �� �޼��尡 ����
		// p.eat();   // ����
		
		
	}

}
