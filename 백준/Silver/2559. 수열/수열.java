import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {	
	
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
//		int max =0;
		
		int[] arr = new int[N];
		int[] arr2 = new int[N-K+1];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=i; j<K+i; j++) {
				arr2[i] += arr[j];
			}
		}
		Arrays.sort(arr2);
		System.out.println(arr2[arr2.length-1]);
    }
}