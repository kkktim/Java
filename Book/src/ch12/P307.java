package ch12;

public class P307 {
	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer("abcd");
		System.out.println("���ڿ� ������ sb1 = "+System.identityHashCode(sb1));
		
		sb1.append("efgh");
		System.out.println("���ڿ� ������ sb1 = "+System.identityHashCode(sb1));
		
		System.out.println(sb1.toString().equals("abcdefg"));
	}

}
