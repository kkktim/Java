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
		
		//클래스의 객체 생성
		E a = new E();
		F b = new F();
		G c = new G(3);
		
		//메서드 호출
		a.work();
		b.work();
		c.work();
	}

}
