package Ch06;

class I {
	int m;
	int n;
	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a;
		this.n = b;
	}
	void work() {
		this.init(2, 3);
	}
}

public class P253 {
	public static void main(String[] args) {
		//Ŭ���� ��ü ����
		I a = new I();
		
		//�޼��� ȣ��
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
	}

}
