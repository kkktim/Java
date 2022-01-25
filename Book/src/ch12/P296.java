package ch12;

public class P296 {
	public static void main(String[] args) {
		
		EnvEx env = new EnvEx();
		
		//객체를 이용해서 생성
		Class c1 = env.getClass();
		System.out.println(c1.getName());
		
		//문자열 주소로 생성
		try {
			Class c2 = Class.forName("ch12.p294");
			System.out.println(c2.getName());
		}catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
