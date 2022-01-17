package ch09;

public class P239 {
	public static void main(String[] args) {
		
		GraphicCard gc = new Amd();
		
		System.out.println("메모리 : "+gc.MEMORY);
		
		//AMD로 생성
		gc = new Amd(); //자동 형변환
		gc.process();
		
		//Nvidia로 교체
		gc = new Nvidia(); //자동 형변환
		gc.process();
		
	}

}
