package ch10;

class Outer {
	interface InterfaceEX {
		void method();
	}
	
	InterfaceEX ie;
	
	void setInterfaceEx(InterfaceEX ie) {
		this.ie = ie;
	}
	
	void outerMethod() {
		ie.method();
	}
}

class InterfaceExImple implements Outer.InterfaceEX {

	@Override
	public void method() {
		System.out.println("InterfaceExImple method()");
	}
	
}

class InterfaceExImple2 implements Outer.InterfaceEX {

	@Override
	public void method() {
		System.out.println("InterfaceExImple2 method()");
	}
	
}

public class P261 {
	public static void main(String[] args) {
		
		Outer out = new Outer();
		
		out.setInterfaceEx(new InterfaceExImple());
		out.outerMethod();
		out.setInterfaceEx(new InterfaceExImple2());
		out.outerMethod();
		
		
	}

}
