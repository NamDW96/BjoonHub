import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int cnt=0;
		int count =0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=2; j<arr[i]; j++) {
				if(arr[i]%j==0) {
					cnt ++;
				}
			}
			if(arr[i]!=1&&cnt==0) {
				count++;
			}
			cnt=0;
		}
		System.out.println(count);
	}	
}