package test4;
/*
 * 날짜 : 2025/07/23
 * 이름 : 김대현
 * 내용 : 자바 API 클래스 연습문제
 * */
class Apple {
	private String country;
	private int price;
	
	public Apple(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
}

class Banana {
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
}

class Grape {
	private String country;
	private int price;
	public Grape(String country, int price) {
		super();
		this.country = country;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Grape [country=" + country + ", price=" + price + "]";
	}
}
public class Test05 {

	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}
	
	public static void showInfo(fruit) {
		
		if(fruit Apple) {
			Apple apple = 
					
		}
	}
}
