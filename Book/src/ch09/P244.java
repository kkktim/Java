package ch09;

interface A {
	void a();
}

interface AA extends A {
	void aa();
}

class AAA implements AA {

	@Override
	public void a() {
		
	}

	@Override
	public void aa() {
		
	}
	
}

interface AB extends A {
	void ab();
}

class ABB implements AB {

	@Override
	public void a() {
		
	}

	@Override
	public void ab() {
		
	}
	
}
public class P244 {
	public static void main(String[] args) {
		
		A a = new AAA();
		
		AA aa = new AAA();
		AAA aaa = new AAA();
		
		A b = new ABB();
		AB ab = new ABB();
		ABB abb = new ABB();
		
		System.out.println("a > A : "+(a instanceof A));
		System.out.println("aa > A : "+(aa instanceof A));
		System.out.println("aaa > A : "+(aaa instanceof A));
		
		System.out.println("aaa > AB : "+(aaa instanceof AB));
	}

}
