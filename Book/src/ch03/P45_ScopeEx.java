package ch03;

public class P45_ScopeEx {

	int no; //1-1. Ŭ���� ���� ������ ��� ������ ����
	
	public static void main(String[] args) { // 2. main �޼��� ����
		
		String name;   // 2-1. main �޼��� ���� ������ ��� ������ ����
		
		if (true) {
			// �޼��� ���� �ȿ��� ������ ���� ��� ����
			name = "ȫ�浿";
			
			// if�� �����ȿ��� ���� ����
			String email = "hong@teat.com";
			
			
		}
		
		// if�� ���� �ۿ��� email ������ ����ϸ� ���� �߻�
		email = "hong@test.com";
	}
	
}
	