package ch07;

class ClassB{
	void print() {
		System.out.println("����� ClassB");
	}
}

public class P184 {
	
	public static void main(String[] args) {
		
		ClassB cb = new ClassB();
		cb.print();
		
	}
	
	public void print() {
		System.out.println("����� ClassA");
	}

}
