package ch08;

public class P208 {
	
	public static void main(String[] args) {
		
		Parent206 p = new Child206();
		
		p.run();
		
		//자식클래스의 자료형으로 변환 (강제형변환)
		Child206 c = (Child206)p;
		
		c.eat();
		
	}

}
