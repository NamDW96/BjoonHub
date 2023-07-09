import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws NumberFormatException, IOException{
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int l = Integer.parseInt(br.readLine());
    	int a = Integer.parseInt(br.readLine());
    	int b = Integer.parseInt(br.readLine());
    	int c = Integer.parseInt(br.readLine());
    	int d = Integer.parseInt(br.readLine());
    	System.out.println((a%c ==0 ? a/c : a/c+1)>(b%d ==0 ? b/d : b/d+1) ?l - (a%c ==0 ? a/c : a/c+1): l - (b%d ==0 ? b/d : b/d+1));
    }
}