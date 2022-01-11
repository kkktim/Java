package ch08;

public class P209 {
	
	public static void main(String[] args) {
		
		GraphicCard gc = new GraphicCard();
		gc.process();   // 원래 그래픽카드 process
		
		gc = new Amd();
		gc.process();
		
		gc = new Nvidia();
		gc.process();
		
	}

}
