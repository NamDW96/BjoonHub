import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		int cnt = 0;
		int m =0;
		
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			int arr[] = new int[m];
			
			for(int j=0; j<m; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
				sum += arr[j];
			}
			sum = sum/m;

			for(int j=0; j<m; j++) {
				if(arr[j]>sum) {
					cnt++;
				}
			}
			System.out.println(String.format("%.3f",((double)cnt/m)*100)+"%");
			sum=0; 
			cnt=0;
		}
	}
}