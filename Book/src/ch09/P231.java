package ch09;

public interface P231 {
	
	//���
	public int MIN_PRICE = 0;
	public int MAX_PRICE = 100000;
	
	//�߻� �޼���
	public double meanPrice();
	public double totalPrice();
	
	//default �޼���
	default double getSalePrice(double price) {
		return price - (price * 0.05);
	}
	
	//static �޼���
	static void printPrice(double price) {
		System.out.println(price);
	}

}
