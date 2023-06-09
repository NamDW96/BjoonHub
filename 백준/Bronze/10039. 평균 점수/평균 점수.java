import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		for(int i=0; i<5; i++) {
			int a= Integer.parseInt(br.readLine());
			if(a<40) {
				n += 40;
			}
			else {
				n += a;
			}
		}
		System.out.println(n/5);
		
	}
}