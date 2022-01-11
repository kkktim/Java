package ch08;

public class P212 {
	
	public static void main(String[] args) {
		
		Game g = new Game();
		
		GraphicCard gc = new GraphicCard();
		g.display(gc);
		
		Amd gc2 = new Amd();
		g.display(gc2);
		
		Nvidia gc3 = new Nvidia();
		g.display(gc3);
		
		
	}

}
