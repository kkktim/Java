package ch08;

public class Child206 extends Parent206 {
	
	String name;
	
	// 재정의 메서드
	void run() {
		System.out.println("자식이 달린다.");
	}
	
	// 추가된 메서드
	void eat() {
		System.out.println("자식이 먹는다.");
	}

}
