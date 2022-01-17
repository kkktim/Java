package ch10;

class A {// 바깥 클래스
	A(){ // 바깥 클래스의 생성자
		System.out.println("A 객체 생성");
	}
	
	static class B {  //static 내부 클래스
		B(){  // static 내부 클래스의 생성자
			System.out.println("C 객체 생성");
		}
		
		int var1;
		static int var2;
		
		void method() {
			System.out.println("static 내부 클래스의 method1()");
		}
		
		static void method2() {
			System.out.println("static 내부 클래스의 static method2()");
		}
		
	}
	
	public class C { // 인스턴스 내부 클래스
		C() { //인스턴스 내부 클래스의 생성자
			System.out.println("B 객체 생성");
		}
		
		int var1;
		
		void method1() {
			System.out.println("인스턴스 내부 클래스의 method1()");
		}
		
	}
	
	void method() {  // 바깥 클래스의 메서드
		
		class D { //로컬 내부 클래스
			D() {
				System.out.println("D 객체 생성");
			}
			
			int var1;
			
			void method1() {
				System.out.println("로컬 내부 클래스의 method1()");
			}
			
		}
		
		D d = new D();
		d.var1 = 3;
		d.method1();
	}
	
}

public class P258 {
	public static void main(String[] args) {
		
		A a = new A();
		
		//static 멤버 클래스 객체 생성
		A.B b =new A.B();
		b.var1 = 3;
		b.method1();
		A.B var2 =3;
		A.B.method2();
		
		//인스턴스 내부 클래스 객체 생성
		A.C c = new C();
		c.var1 = 3;
		c.method1();
		
		//로컬 클래스 객체 생성을 위한 메소드 호출
		a.method();
		
	}

}
