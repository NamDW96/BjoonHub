import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		
		for(int i=0; i<n; i++) {
			String str = sc.nextLine();
			char[] ch = str.toCharArray();
			System.out.println(ch[0]+""+ch[ch.length-1]);
		}
	}
}