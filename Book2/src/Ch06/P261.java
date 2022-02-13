package Ch06;

class M {
	int m1, m2, m3, m4;
	M(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	M(int a){
		m1 = a;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	M(int a, int b){
		m1 = a;
		m2 = b;
		m3 = 3;
		m4 = 4;
	}
	void print() {
		System.out.print(m1 + " ");
		System.out.print(m2 + " ");
		System.out.print(m3 + " ");
		System.out.print(m4);
		System.out.println();
	}
}

class N {
	int m1, m2, m3, m4;
	N(){
		m1 = 1;
		m2 = 2;
		m3 = 3;
		m4 = 4;
	}
	N(int a){
		this();
		m1 = a;
	}
	N(int a, int b){
		this(a);
		m2 = b;
	}
	void print() {
		System.out.print(m1+" ");
		System.out.print(m2+" ");
		System.out.print(m3+" ");
		System.out.print(m4);
		System.out.println();
	}
}

public class P261 {
	public static void main(String[] args) {
		//3가지 객체 생성(this() 미사용)
		M a1 = new M();
		M a2 = new M(10);
		M a3 = new M(10, 20);
		a1.print();
		a2.print();
		a3.print();
		System.out.println();
		
		//3가지 객체 생성(this() 사용)
		N b1 = new N();
		N b2 = new N(10);
		N b3 = new N(10, 20);
		b1.print();
		b2.print();
		b3.print();
	}

}
