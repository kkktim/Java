package Ch06;

import java.util.Arrays;

public class P235 {
	public static void main(String[] args) {
		//�迭�� �Է¸Ű������� �ϴ� �޼��� ȣ��
		int[] a = new int[] {1, 2, 3};
		printArray(a);
		printArray(new int[] {1, 2, 3});
		// printArray({1, 2, 3})  //�����߻�
	}
	
	public static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}

}
