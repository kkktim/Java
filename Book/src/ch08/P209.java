package ch08;

public class P209 {
	
	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process();   // ���� �׷���ī�� process
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
		
	}

}
