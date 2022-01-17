package ch09;

interface MyInterface1 {
	
	default void defaultMethod() {
		System.out.println("MyInterface1 �� default �޼���");
	}
	
	static void staticMethod() {
		System.out.println("Myinterface1 �� static �޼���");
	}
}

interface MyInterface2 {
	
	default void defaultMethod() {
		System.out.println("MyInterface2 �� default �޼���");
	}
	
	static void staticMethod() {
		System.out.println("MyInterface2 �� static �޼���");
	}
}

class Parent {
	public void method2() {
		System.out.println("Parent Ŭ������ method2()");
	}
}

class Child extends Parent implements MyInterface1, MyInterface2 {

	@Override
	public void defaultMethod() {
		System.out.println("Child Ŭ������ default �޼���");
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
