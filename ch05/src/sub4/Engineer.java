package sub4;

public class Engineer extends Person {

	public Engineer(String name, int age) {
		super(name, age);
		this.name = name;
		this.age = age;
	}
	
	protected String field;
	
	public void Engineer (String field) {
		this.age = age;
		this.name = name;
		this.field = field;
	}
	
	public void work() {
		System.out.printf("제 이름은 [%s] 이고 나이는 [%c]세 입니다.\n", this.name,this.age);
		System.out.printf("저는 [%s] 엔지니어입니다.",this.field);
	}
	
	

}
