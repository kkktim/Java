package ch08;

public class P206 {
	
	public static void main(String[] args) {
		
		Child206 c = new Child206();
		
		c.run();
		
		// 부모클래스의 자료형으로 선언 (자동형변환)
		Parent206 p = new Child206();
		p.run();   // 재정의 된 메서드가 실행
		// p.eat();   // 에러
		
		
	}

}
