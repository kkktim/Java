package ch08;

public class P213 {
	
	public static void main(String[] args) {
		
		allObject(new GraphicCard());
		allObject(new Amd());
		allObject(new Nvidia());
		allObject("�ȳ�");
		
	}
	
	public static void allObject(Object obj) {
		
		System.out.println(obj.toString());
	}

}
