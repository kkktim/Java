package Ch04;

public class P142 {
	public static void main(String[] args) {
		//���� �ݺ��� Ż��
		for(int i=0 ; i<10 ; i++) {
			System.out.println(i);
			break;
		}
		
		for(int i=0 ; i<10 ; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println();
		
		//���� �ݺ��� Ż��
		//@1���� �ݺ����� Ż���� ��
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(j == 2) {
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		
		//@break + Label ������ ���� �ݺ��� Ż��
		POS1: for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(j == 2) {
					break POS1;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		
		//@�������� ������ ���� �ݺ��� Ż��
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<5 ; j++) {
				if(j==2) {
					i = 100;
					break;
				}
				System.out.println(i+", "+j);
			}
		}
		System.out.println();
		
	}

}
