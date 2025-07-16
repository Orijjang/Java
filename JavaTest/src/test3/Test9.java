package test3;
/* 날짜 : 2025/07/16
 * 이름 : 김대현	
 * 내용 : 자바 클래스 연습문제
 * */

abstract class Shape {
	public abstract void draw();
}
class Triangle extends Shape {
	public void draw() {
		System.out.println("draw Triangle!");
	}
}
class Circle extends Shape {
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class Test9 {
	public static void main(String[] args) {
	
		Test9 here = new Test9();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);;
		here.draw(triangle);
}
	public void draw(Shape obj) {
		obj.draw();
	}
}
