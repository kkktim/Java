package ch07;

class MethodEx {
	void one() {
		two();
		System.out.println("one");
	}
	
	void two() {
		three();
		System.out.println("two");
		
	}
	
	void three() {
		System.out.println("three");
	}
}

public class P160 {
	
	public static void main(String[] args) {
		
		MethodEx me = new MethodEx();
		
		me.one();   // 메서드 실행
		
		
	}

}
