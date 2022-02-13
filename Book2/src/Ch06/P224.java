package Ch06;

// 클래스 생성
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
		//클래스로 객체 생성
		B a = new B();
		//필드값 출력
		System.out.println(a.m);
		System.out.println(a.n);
		//메서드 호출
		a.work1();
	}

}
