package Ch06;

public class P233 {
	public static void main(String[] args) {
		//���� Ŭ���� �ȿ� �ִ� ���� �޼��� ȣ��
		print();
		
		int a = twice(3);
		System.out.println(a);
		
		double b = sum(a, 5.8);
		System.out.println(b);
	}
		
		public static void print() {
			System.out.println("�ȳ�");
		}
		
		public static int twice(int k) {
			return k * 2;
		}
		
		public static double sum(int m, double n) {
			return m + n;
		}
	}

