import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		
		int arr[] = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = sc.nextInt();			
		}
		
		int a = sc.nextInt();
		int cnt =0;
		for(int i=0; i<N; i++) {
			if(arr[i]==a) {
				cnt++;
			}
		}
		System.out.println(cnt);	
	}
}