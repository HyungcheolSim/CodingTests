import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        for(int i=0;i<T;i++){
            st = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int GCD = gcd(a,b);

            sb.append(a * b / GCD).append("\n");
        }
        System.out.print(sb);
    }
    public static int gcd(int a, int b){
        while( b != 0 ){
            int r = a % b;

            a = b;
            b = r;
        }
        return a;
	}
}