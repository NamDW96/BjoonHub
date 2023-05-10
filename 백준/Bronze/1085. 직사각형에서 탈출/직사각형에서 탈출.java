import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		
		int xnum , ynum;
		
		if(x-a>a) {
			xnum = a;
		} else {
			xnum = x-a;
		}
		
		if(y-b>b) {
			ynum = b;
		} else {
			ynum = y-b;
		}
		 
		if(xnum>ynum) {
			System.out.println(ynum);
		} else {
			System.out.println(xnum);
		}
		
	}
}