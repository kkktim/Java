package Ch06;
// Ŭ���� ����(����)
class C {
	boolean m1;
	int m2;
	double m3;
	String m4;
	void printFieldValue() {
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
	}
	void printLocalVariable() {
		int k;
		//System.out.println(k);
	}
}
public class P226 {
	public static void main(String[] args) {
		//Ŭ������ Ȱ���� ��ü ����
		C a = new C();
		//��ü Ȱ��
		a.printFieldValue();
	}

}
