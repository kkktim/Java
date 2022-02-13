package Ch06;

class J {
	int m;
	int n;
	void init(int m, int n) {
		m = m;
		n = n;
	}
}
class K {
	int m;
	int n;
	void init(int m, int n) {
		this.m = m;
		this.n = n;
	}
}
public class P256 {
	public static void main(String[] args) {
		//필드명과 지역 변수명이 같고, this 키워드를 사용하지 않음.
		J j = new J();
		j.init(2, 3);
		System.out.println(j.m);
		System.out.println(j.n);
		
		//필드명과 지역 변수명이 같고, this 키워드를 사용함.
		K k = new K();
		k.init(2, 3);
		System.out.println(k.m);
		System.out.println(k.n);
	}

}
