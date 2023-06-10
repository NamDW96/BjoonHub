import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		
		sb.append(Math.min(a, Math.min(b,c)) + " ");
		sb.append(a>b ? (b>c ? b : a>c ? c:a) : (c>a ? c>b? b:c : a ));
		sb.append(" " + Math.max(a, Math.max(b,c)));
		System.out.println(sb);
		
		
	}
}