package sub4;

public class Doctor extends Person {

	public Doctor(String name, int age, String specialty) {
		super(name,age);
		this.specialty = specialty;
	}

	protected String specialty;
	
	/*public void Doctor(String specialty) {
		this.specialty = specialty;
	}
	*/
	
	
	public void work() {
		super.introduce();
		//System.out.printf("제 이름은 [%s] 이고 나이는 [%c]세 입니다.\n", this.name,this.age);
		System.out.printf("저는 의사이며 전공은 [%s] 입니다.\n",this.specialty);
	}
}
