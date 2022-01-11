package ch08;

public class P202 {

}

class Parent2 {
	
	String name;
	
	Parent2(String name) {
		this.name = name;
	}
}

class Child2 extends Parent2 { // 에러 발생
	
	Child2(String name) {   // 부모 생성자를 실행해 주어야 한다.
		super(name);
	}
}