package Ch06;
class O {
	boolean a;
	int b;
	double c;
	String d;
	
	void abc() {
		System.out.println(b + c);
		System.out.println(c + d);
		System.out.println(d + a);
	}
}
public class Q1 {
	public static void main(String[] args) {
		O a = new O();
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(a.c);
		System.out.println(a.d);
		System.out.println();
		
		a.abc();
	}

}
