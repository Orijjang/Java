package test7.sub02;

public class Product {

	public String prodId;
	public String prodName;
	public int price;
	public int quantity;
	
	public Product(String product, String prodName, int price, int quantity) {
		this.prodId = product;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void printProductInfo() {
		/*System.out.println("상품코드 : " +this.prodId);
		System.out.println("상품코드 : " +this.prodName);
		System.out.println("상품코드 : " +this.price);
		System.out.println("재고수량 : " +this.quantity);*/
	}
	
}
