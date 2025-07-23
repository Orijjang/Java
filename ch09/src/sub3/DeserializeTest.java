package sub3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
 * 날짜 : 2025/07/23
 * 이름 : 김대현	
 * 내용 : 역직렬화(DeserializeTest) 실습 
 */
public class DeserializeTest {

	public static void main(String[] args) {
		String path = "C:\\Users\\GGG\\Desktop\\apple.date";
		
		try {
			
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			//객체 직렬화 : 내부의 생성된 객체를 외부 파일로 내보내기
			//역직렬화 : 외부의 객체파일을 내부의 객체로 불러오기
			
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			//스트림 종료
			ois.close();
			fis.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
