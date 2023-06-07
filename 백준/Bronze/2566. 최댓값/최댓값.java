import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[][] = new int[10][10];
		int max=0;
		int maxi=0;
		int maxj=0;
		
		for (int i = 1; i < 10; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<10; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j]>=max) {
					max=arr[i][j];
					maxi=i;
					maxj=j;
				}
			}
		}
		System.out.println(max);
		System.out.println(maxi+ " " + maxj);
	}
}
