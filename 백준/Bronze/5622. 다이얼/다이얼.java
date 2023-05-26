import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		char[] a = str.toCharArray();
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]=='Z') {
				sum+=10;
			}else if(a[i]-'A'>=18) {
				sum+= (a[i]-'B')/3+3;
			} else {
				sum += (a[i]-'A')/3+3;
			}
		}
		System.out.println(sum);
	}
}
