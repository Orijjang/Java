package test7.sub02;

public class Clothes extends Product{

	public String size;
	public Clothes(String product, String prodName, int price, int quantity, String size) {
		super(product, prodName, price, quantity);
	}

	public void printProductInfo() {
		System.out.println("상품코드 : " +this.prodId);
		System.out.println("상품코드 : " +this.prodName);
		System.out.println("상품코드 : " +this.price);
		System.out.println("재고수량 : " +this.quantity);
		System.out.println("사이즈 : " +this.size);
		
	}
	
}
