import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		for(int i=0; i<2; i++) {
			int a1 = Integer.parseInt(br.readLine()); 
			if(a1<a) {
				a = a1;
			}
		}
		
		int b= Integer.parseInt(br.readLine());
		int b1 = Integer.parseInt(br.readLine()); 
		System.out.println(b>b1 ? a+b1 -50 : a+b -50);

	}
}
