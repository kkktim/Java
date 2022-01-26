package ch12;

public class P303 {
	public static void main(String[] args) {
		
		String str = "Hello My Name is Hong Gil Dong";
		
		System.out.println(str.charAt(6));
		System.out.println(str.equals("Hello My Name is Hong Gil Dong"));
		System.out.println(str.indexOf("Hong"));
		System.out.println(str.indexOf("H"));
		System.out.println(str.substring(17));
		System.out.println(str.substring(6, 13));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.length());
		System.out.println(str.startsWith("Hello"));
		System.out.println(str.endsWith("Dong"));
		System.out.println(str.replace("Hong", "Kim"));
		System.out.println(str.replaceAll("Name", "NickName"));
		System.out.println(str.toString());
		
		str ="    안녕 하세요,     반갑습니다.          ";
		System.out.println(str.trim()); //앞뒤 공백 제거
		System.out.println(str.replace(" ", ""));
		
		str = String.valueOf(10);  //기본자료형 int를 문자열로 변환
		str = String.valueOf(10.5);   //기본자료형 double을 문자열로 변환
		
		str = "홍길동,이순신,유관순,안중근";
		String[] arr = str.split(",");  // ,를 구분자로 나눠서 배열로 리턴
		for(int i=0 ; i<arr.length ; i++) {
			System.out.println(i+"번 인덱스 값 = "+arr[i]);
		}
	}

}
