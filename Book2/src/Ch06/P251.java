package Ch06;

class H {
	H(){
		System.out.println("ù ��° ������");
	}
	H(int h){
		System.out.println("�� ��° ������");
	}
	H(int h, int i){
		System.out.println("�� ��° ������");
	}
}

public class P251 {
	public static void main(String[] args) {
		H h1 = new H();
		H h2 = new H(3);
		H h3 = new H(3, 5);
	}

}
