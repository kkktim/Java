package ch09;

public class P235 {
	
	public static void main(String[] args) {
		
		Fax fax = new Fax() {
			
			@Override
			public void send(String tel) {
				System.out.println("����� �͸� ���� ��ü�� send()");
			}
			
			@Override
			public void receive(String tel) {
				System.out.println("����� �͸� ���� ��ü�� receive()");
			}
		};
		
		fax.send("1234");
		fax.receive("5678");
	}

}
