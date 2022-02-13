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
		//클래스 객체 생성
		I a = new I();
		
		//메서드 호출
		a.work();
		System.out.println(a.m);
		System.out.println(a.n);
	}

}
