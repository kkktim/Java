package ch09;

interface MyInterface1 {
	
	default void defaultMethod() {
		System.out.println("MyInterface1 의 default 메서드");
	}
	
	static void staticMethod() {
		System.out.println("Myinterface1 의 static 메서드");
	}
}

interface MyInterface2 {
	
	default void defaultMethod() {
		System.out.println("MyInterface2 의 default 메서드");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface2 의 static 메서드");
	}
}

class Parent {
	public void method2() {
		System.out.println("Parent 클래스의 method2()");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {

	@Override
	public void defaultMethod() {
		System.out.println("Child 클래스의 default 메서드");
		MyInterface1.super.defaultMethod();
		MyInterface2.super.defaultMethod();
	}
	
}

public class P246 {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.defaultMethod();
		c.method2();
		
		MyInterface1.staticMethod();
		MyInterface2.staticMethod();
	}

}
