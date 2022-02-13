package Ch06;

public class P237 {
	public static void main(String[] args) {
		int a = 3;
		int result = twice(3);
		System.out.println(result);
		int result2 = twice(a);
		System.out.println(result2);
		System.out.println(a);
	}
	
	public static int twice(int a) {
		a = a*2;
		return a;
	}

}
