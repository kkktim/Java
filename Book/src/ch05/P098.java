package ch05;

public class P098 {
	
	public static void main(String[] args) {
		
		for(int j=2; j<10; j++) {
			System.out.println("["+j+"´Ü]");
			for(int i=1; i<10; i++) {
				System.out.println(j + "*" + i + "=" + j*i);
			}
		}
		
	}

}
