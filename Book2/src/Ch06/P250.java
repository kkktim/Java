package Ch06;

class E {
	int m;
	void work() {
		System.out.println(m);
	}
}

class F {
	int m;
	void work() {
		System.out.println(m);
	}
	F(){
		
	}
}

class G {
	int m;
	void work() {
		System.out.println(m);
	}
	G(int a){
		m = a;
	}
}

public class P250 {
	public static void main(String[] args) {
		
		//Ŭ������ ��ü ����
		E a = new E();
		F b = new F();
		G c = new G(3);
		
		//�޼��� ȣ��
		a.work();
		b.work();
		c.work();
	}

}
