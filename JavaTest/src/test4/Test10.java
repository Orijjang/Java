package test4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 날짜 : 2025/07/23
 * 이름 : 김대현
 * 내용 : 자바 파일 입출력 연습문제
 * */

public class Test10 {

	public static void main(String[] args) {
		String path = "C:\\Users\\<계정명>\\Desktop\\Result.txt";
		
		try {
			File file = new File(path);
			FileWriter fw = new FileWriter(file);
			
			for(int x=2 ; x<=9 ; x++) {
				fw.write(x);
				
				for(int y=1 ; y <=8; y++) {
					int z = x*y;
					fw.
				}
			}
			fw.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("구구단 파일 출력 완료...");
	}
}
