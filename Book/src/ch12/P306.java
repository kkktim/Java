package ch12;

public class P306 {
	public static void main(String[] args) {
		
		String str1 = "abcd";
		String str2 = "abcd";
		System.out.println("str1 = "+System.identityHashCode(str1));
		System.out.println("str2 = "+System.identityHashCode(str2));
		
		str1 = str1 + "efg";
		System.out.println("str3 = "+System.identityHashCode(str1));
	}

}
