import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] a = S.toCharArray();
		int o = 0;
		int intArr[] = new int[26];
		Arrays.fill(intArr,-1);
		 for (int i=0; i<a.length; i++) {
			o = a[i]-'a'; 
			if(intArr[o] == -1) {
			intArr[o] = i;		}	
		}
		 for (int i=0; i<intArr.length; i++) {
			 System.out.print(intArr[i]+" "); 
		 }
	}

}
