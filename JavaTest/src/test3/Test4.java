package test3;
/* 날짜 : 2025/07/16
 * 이름 : 김대현	
 * 내용 : 자바 클래스 연습문제
 * */

class Student {
	static int studentld;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentld++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	public void studentInfo() {
		System.out.println("==========");
		System.out.println("학번 : "+studentld);
		System.out.println("이름 : "+studentName);
		System.out.println("전공 : "+major);
		System.out.println("학년 : "+grade);
	}
}
public class Test4 {
	public static void main(String[] args) {
		Student.studentld = 20201000;
		Student kim = new Student("김유신", "국문과",1);
		kim.studentInfo();
		Student lee = new Student("이순신", "경제학과",1);
		lee.studentInfo();
		Student lim = new Student("임꺽정", "경영학과",1);
		lim.studentInfo();
	}
}
