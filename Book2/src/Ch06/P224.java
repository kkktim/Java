package Ch06;

// Ŭ���� ����
class B {
	int m = 3;
	int n = 4;
	void work1() {
		int k = 5;
		System.out.println(k);
		work2(3);
	}
	void work2(int i) {
		int j = 4;
		System.out.println(i + j);
	}
}

public class P224 {
	public static void main(String[] args) {
		//Ŭ������ ��ü ����
		B a = new B();
		//�ʵ尪 ���
		System.out.println(a.m);
		System.out.println(a.n);
		//�޼��� ȣ��
		a.work1();
	}

}
