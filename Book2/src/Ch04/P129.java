package Ch04;

public class P129 {
	public static void main(String[] args) {
		//for�� �⺻ ���� ����
		int a;
		for(a=0 ; a<3 ; a++) {
			System.out.print(a+" ");
		}
		System.out.println();
		
		for(int i = 0 ; i<3 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=0 ; i<100 ; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=10 ; i>0 ; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=0 ; i<10 ; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		for(int i=0, j=0 ; i<10 ; i++, j++) {
			System.out.print(i + j + " ");
		}
		System.out.println();
		
		//for ���� Ư���� ����(���ѷ���)
		/*
		 for(int i=0 ; ; i++){
		 	System.out.print(i + " ");
		 }
		 for(;;){
		 	System.out.print("���ѷ���");
		 }
		 */
		System.out.println();
		
		//���ѷ���Ż��
		for(int i=0 ; ; i++) {
			if(i>10) {
				break;
			}
			System.out.print(i + " ");
		}
		System.out.println("���� ���� Ż��");
	}

}
