package Ch06;

class L {
	L(){
		System.out.println("첫 번째 생성자");
	}
	L(int a){
		this();
		System.out.println("두 번째 생성자");
	}
}

public class P257 {
	public static void main(String[] args) {
		//객체 생성
		L l1 = new L();
		System.out.println();
		L l2 = new L(3);
	}

}
