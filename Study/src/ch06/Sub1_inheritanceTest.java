package ch06;

/*
 * ��¥ : 2022/01/05
 * �̸� : ����ȣ
 * ���� : �ڹ� Ŭ���� ��� �ǽ��ϱ� ���� p196
 */

public class Sub1_inheritanceTest {
	
	public static void main(String[] args) {
		
		StockAccount kb = new StockAccount("kb����", "101-11-102", "ȫ�浿", 10000, "�Ｚ����", 10, 70000);
		
		kb.deposit(1000000);
		kb.withdraw(200000);
		kb.show();
		
		kb.buy(10, 65000);
		kb.show();
		
		kb.sell(10, 72000);
		kb.show();
		
		
		
		
	}

}
