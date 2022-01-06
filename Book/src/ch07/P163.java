package ch07;

class Operator163 {
	
	int multiply(int x, int y) {
		System.out.println("(int, int)");
		return x * y;
	}
	
	double multiply(double x, double y) {
		System.out.println("(double, double)");
		return x * y;
	}
	
	double multiply(int x, double y) {
		System.out.println("(int, double)");
		return x * y;
	}
	
	double multiply(double x, int y) {
		System.out.println("(double, int)");
		return x * y;
		
	}

}

public class P163 {
	
	public static void main(String[] args) {
		
		Operator163 op = new Operator163();
		
		System.out.println(op.multiply(4, 3));
		System.out.println(op.multiply(4.5, 3.5));
		System.out.println(op.multiply(4, 3.5));
		System.out.println(op.multiply(4.5, 3));
		
	}

}
