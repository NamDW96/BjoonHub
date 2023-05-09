import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		int anum= a/100 + (a%10)*100 + a%100-a%10;
		int bnum= b/100 + (b%10)*100 + b%100-b%10;
		
		if(anum>bnum) {
			System.out.println(anum);
		} else {
			System.out.println(bnum);
		}

	}
}
