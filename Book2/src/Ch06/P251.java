package Ch06;

class H {
	H(){
		System.out.println("첫 번째 생성자");
	}
	H(int h){
		System.out.println("두 번째 생성자");
	}
	H(int h, int i){
		System.out.println("세 번째 생성자");
	}
}

public class P251 {
	public static void main(String[] args) {
		H h1 = new H();
		H h2 = new H(3);
		H h3 = new H(3, 5);
	}

}
