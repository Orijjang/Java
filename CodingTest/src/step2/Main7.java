package step2;

import java.util.Scanner;

public class Main7 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = 0;
		
		if((a==b)&&(b==c)) {
			d=a;
		}else if((a==b)&&(b!=c)) {
			d=a;
		}else if((a==c)&&(b!=c)) {
			d=a;
		}else if((c==b)&&(a!=c)) {
			d=b;
		}else if((a!=b)&&(b!=c)&&(c!=a)) {
			d.max(a,b,c);
		}
			
	}
	
}
