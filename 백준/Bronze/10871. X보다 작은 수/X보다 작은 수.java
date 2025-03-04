import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int cnt = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] nums = new int[cnt];
        st = new StringTokenizer(br.readLine()," ");
        for(int i=0;i<cnt;i++){
            int N =Integer.parseInt(st.nextToken());
            if(X>N){
                sb.append(N).append(" ");
            }
        }
        System.out.print(sb);
    }
}
