import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); 
        StringTokenizer st;
        int[] dates = new int[T];
        int[] pays = new int[T];
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            dates[i] = Integer.parseInt(st.nextToken());
            pays[i] = Integer.parseInt(st.nextToken());
        }
        int[] dp = new int[T + 1];
        for (int i = 0; i < T; i++) {
            if (i + dates[i] <= T) {
                dp[i + dates[i]] = Math.max(dp[i + dates[i]], dp[i] + pays[i]);
            }
            dp[i + 1] = Math.max(dp[i + 1], dp[i]);

        }
        System.out.println(dp[T]);
    }
}