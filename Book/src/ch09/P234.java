package ch09;

public class P234 {
	
	public static void main(String[] args) {
		
		Complexer com = new Complexer();
		System.out.println(Complexer.INK);
		System.out.println(Complexer.FAX_NUMBER);
		com.print();
		com.scan();
		com.send("02-8765-4321");
		com.receive("02-8765-4321");
		
	}

}
