package ch10;

class A {// �ٱ� Ŭ����
	A(){ // �ٱ� Ŭ������ ������
		System.out.println("A ��ü ����");
	}
	
	static class B {  //static ���� Ŭ����
		B(){  // static ���� Ŭ������ ������
			System.out.println("C ��ü ����");
		}
		
		int var1;
		static int var2;
		
		void method() {
			System.out.println("static ���� Ŭ������ method1()");
		}
		
		static void method2() {
			System.out.println("static ���� Ŭ������ static method2()");
		}
		
	}
	
	public class C { // �ν��Ͻ� ���� Ŭ����
		C() { //�ν��Ͻ� ���� Ŭ������ ������
			System.out.println("B ��ü ����");
		}
		
		int var1;
		
		void method1() {
			System.out.println("�ν��Ͻ� ���� Ŭ������ method1()");
		}
		
	}
	
	void method() {  // �ٱ� Ŭ������ �޼���
		
		class D { //���� ���� Ŭ����
			D() {
				System.out.println("D ��ü ����");
			}
			
			int var1;
			
			void method1() {
				System.out.println("���� ���� Ŭ������ method1()");
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
		
		//static ��� Ŭ���� ��ü ����
		A.B b =new A.B();
		b.var1 = 3;
		b.method1();
		A.B var2 =3;
		A.B.method2();
		
		//�ν��Ͻ� ���� Ŭ���� ��ü ����
		A.C c = new C();
		c.var1 = 3;
		c.method1();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
		
	}

}
