package Ch04;

public class P137 {
	public static void main(String[] args) {
		//�ݺ� Ƚ���� 0�� �� do-while ���� while �� ��
		int a;
		a = 0;
		while(a<0) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a=0;
		do {
			System.out.print(a+" ");
			a++;
		}while(a<0);
		System.out.println();
		
		//�ݺ� Ƚ���� 1�� �� do-while ���� while �� ��
		a = 0;
		while(a<1) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a+ " ");
			a++;
		} while(a<1);
		System.out.println();
		
		//�ݺ� Ƚ���� 10�� �� do-while���� while�� ��
		a = 0;
		while(a<10) {
			System.out.print(a+" ");
			a++;
		}
		System.out.println();
		
		a = 0;
		do {
			System.out.print(a+" ");
			a++;
		} while(a<10);
		
	}

}
