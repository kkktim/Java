package ch11;

public class P271 {
	public static void main(String[] args) {
		System.out.println("DB���� ����");
		try {
			System.out.println("DB�۾�");
			System.out.println(3/0);
		}catch (Exception e) {
			System.out.println("DB�۾� �� ���ܹ߻�");
		}finally {
			System.out.println("DB���� ����");
		}
	}

}
