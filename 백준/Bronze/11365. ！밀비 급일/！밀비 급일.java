import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (true) {
            str = br.readLine();
            if (str.equals("END"))
                break;

            char[] st = str.toCharArray();
            for (int i = st.length - 1; i >= 0; i--) {
                System.out.print(st[i]);
            }
            System.out.println();
        }
    }
}
