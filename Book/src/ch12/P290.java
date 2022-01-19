package ch12;

class Fruit{
	String name;
	String color;
	public Fruit(String name, String color) {
		this.name = name;
		this.color = color;
	}
}

public class P290 {
	public static void main(String[] args) {
		
		Fruit f = new Fruit("»ç°ú", "»¡°­");
		System.out.println(f);
		
	}

}
