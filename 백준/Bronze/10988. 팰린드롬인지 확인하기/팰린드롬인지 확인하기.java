import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] ch =str.toCharArray();
		int left =0;
		int right =ch.length-1;
		while(left < right) {
			if(ch[left++] != ch[right--]) {
				System.out.println(0);
				return;
			}
		}
		System.out.println(1);
		
	}
}
