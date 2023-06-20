import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> s = new Stack<>();
		int k = Integer.parseInt(br.readLine());
		int sum=0;
		int a = 0;
		for(int i=0; i<k; i++) {
			a = Integer.parseInt(br.readLine());
			if(a!=0) {
				s.push(a);
			} else if(a==0) {
				s.pop();
			}
		}
		while(!s.empty()) {
			sum += s.pop();
		}
		System.out.println(sum);
	}
}
