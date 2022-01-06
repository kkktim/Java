package ch07;

class Local{
	String name;
	
	void process() {
		name = "홍길동";
	}
	void printAge1() {
		int age = 20;   //지역변수
		System.out.println(age);
	}
	void printAge2() {
		int age = 30;    //지역변수
		System.out.println(age);
	}
}

public class P150 {
	
	public static void main(String[] args) {
		
		Local local = new Local();
		
		System.out.println(local.name);   // null
		
		local.process();
		System.out.println(local.name);   // 홍길동
		
		local.printAge1();
		local.printAge2();
		
		// for문 블럭 내에서의 변수 선언
		for (int i=0 ; i<10 ; i++) {
			int temp = o;
			temp += i;
			
		}
		System.out.println(temp);  //에러
		
	}

}
