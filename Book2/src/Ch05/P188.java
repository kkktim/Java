package Ch05;

public class P188 {
	public static void main(String[] args) {
		// args �迭�� ���� ���ϱ�
		System.out.println(args.length);
		System.out.println();
		
		//�Է¸Ű����� ���1
		for(int i=0 ; i<args.length ; i++) {
			System.out.println(args[i]);
		}
		System.out.println();
		
		//�Է¸Ű����� ���2
		for(String s:args) {
			System.out.println(s);
		}
		System.out.println();
		
		
		
	}
}
