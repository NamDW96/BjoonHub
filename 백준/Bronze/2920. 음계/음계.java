import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];	
		int[] arr2 = new int[8];
		
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = arr[i];
		}
		
		Arrays.sort(arr2);
		
		int cnt=0;
		int cnt2=0;
		
		for(int i=0; i<8; i++) {
			if(arr[i]!=arr2[i]) {
				cnt++;
			}
		}
		
		if(cnt==0) {
			System.out.println("ascending");
		}
		
		for(int i=0; i<8; i++) {
			if(arr[i]!=arr2[7-i]) {
				cnt2++;
			}
		}
		
		if(cnt2==0) {
			System.out.println("descending");
		}
		
		if(cnt!=0&&cnt2!=0) {
			System.out.println("mixed");
		}		
	}
}
