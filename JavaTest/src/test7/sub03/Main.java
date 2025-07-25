package test7.sub03;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("김유신", "1990-05-07");
		person.printPersonInfo();
		System.out.println("============================");
		
		Employee emp = new Employee("김춘추", "1990-05-07");
		person.printPersonInfo();
		System.out.println("============================");
	}
}
