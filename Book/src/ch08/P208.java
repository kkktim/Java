package ch08;

public class P208 {
	
	public static void main(String[] args) {
		
		Parent206 p = new Child206();
		
		p.run();
		
		//�ڽ�Ŭ������ �ڷ������� ��ȯ (��������ȯ)
		Child206 c = (Child206)p;
		
		c.eat();
		
	}

}
