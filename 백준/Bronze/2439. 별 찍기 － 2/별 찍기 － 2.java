import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=n;i++){
            for(int ii=1;ii<=n-i;ii++){
                sb.append(" ");
            }
            for(int iii=n-i;iii<n;iii++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}