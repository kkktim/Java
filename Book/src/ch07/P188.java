package ch07;

class Final {
	final int number;
	
	Final(){
		number = 100;
	}
}

public class P188 {
	
	public static void main(String[] args) {
		
		Final f = new Final();
		f.number = 200; //¿¡·¯
		
		
	}

}
