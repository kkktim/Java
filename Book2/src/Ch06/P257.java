package Ch06;

class L {
	L(){
		System.out.println("ù ��° ������");
	}
	L(int a){
		this();
		System.out.println("�� ��° ������");
	}
}

public class P257 {
	public static void main(String[] args) {
		//��ü ����
		L l1 = new L();
		System.out.println();
		L l2 = new L(3);
	}

}
