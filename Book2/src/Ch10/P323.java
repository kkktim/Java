package Ch10;

class A {}
class B extends A {}
class C extends B {}
class D extends B {}

public class P323 {
	public static void main(String[] args) {
		//��ĳ����(�ڵ���ȯ): ĳ���� ������ �������� �� �����Ϸ��� �ڵ����� �߰�
		A ac = (A) new C();
		B bc = (B) new C();
		
		B bb = new B();
		A a = (A) bb;
		
		//�ٿ�ĳ����(������ȯ): ĳ������ �� ���� ��(������ �� ���� �߻�)
		A aa = new A();
		B b = (B) aa;
		C c = (C) aa;
		
		//�ٿ�ĳ����(������ȯ): ĳ������ ������ ��
		A ab = new B();
//		B b = (B) ab;     // A->B �ٿ�ĳ����(������ȯ)
//		C c = (C) ab;     // A->C �ٿ�ĳ����(������ȯ):�Ұ���
		
		B bd = new D();
		B d = (D) bd;
		
		A ad = new D();
		B b1 = (B) ad;
		D d1 = (D) ad;
		
		
	}
}
