package step2;

import java.util.Scanner;

public class Main6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hour = sc.nextInt();
		int minute = sc.nextInt();
		int c = sc.nextInt();
		
	
	    int totalMinutes = hour * 60 + minute + c;

       
        hour = (totalMinutes / 60) % 24;
        minute = totalMinutes % 60;
		System.out.println(hour + " " + minute);
	}
}
