import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {


		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		char[] ch =  str.toCharArray();
		
		for(int i=0; i<ch.length; i++) {
			if((int)ch[i]<90) {
				ch[i] = (char)(ch[i]+32);
			}
			else {
				ch[i]= (char)(ch[i]-32);
			}
			System.out.print(ch[i]);
		}
	}
}