package ch11;

public class P277 {
	public static void main(String[] args) throws Exception {
		try {
			first();
		}catch (Exception e) {
			System.out.println("main() 예외 처리");
			System.out.println(e.getMessage());
			throw e;
		}
	}

}
