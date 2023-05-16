import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(br.readLine());
		
		b= b+n%60;
		if(b>=60) {
			b = b-60;
			a = a+1;
		}
		a = a+n/60;
		if(a>=24) {
			a=a-24;
		}
		System.out.println(a + " " + b);
	}
}
