import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int num;
		for(int i=0; i<3; i++) {
			num = 0;
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				num += Integer.parseInt(st.nextToken());
			}
			char result = (char)(68-num);
			if(num ==4) {
				System.out.println("E");
			} else if(num == 0) {
				System.out.println("D");
			} else {
				System.out.println(result);
			}
			
		}
	}
}
