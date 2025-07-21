package sub3;
/*
 * 날짜 : 2025/07/21	
 * 이름 : 김대현
 * 내용 : 자바 StringBuilder 클래스 실습하기
 * 
 * */
public class StringBuilderTest {

	public static void main(String[] args) {
		
		//String의 불변성(Immutable)
		String str = "Java";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		str += "Programming";
		System.out.println("str 주소 : " + System.identityHashCode(str));
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder("Java");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));
		
		sb.append("Programming");
		System.out.println("sb 주소 : " + System.identityHashCode(sb));

		System.out.println(sb);
			}
}
