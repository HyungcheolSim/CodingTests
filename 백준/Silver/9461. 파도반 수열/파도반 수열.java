import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static Long[] dp = new Long[101];;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            dp[0] = 0L;
            dp[1] = dp[2] = dp[3] = 1L;
            if (N < 3) {
                System.out.println(dp[N]);
            } else {
                System.out.println(recursive(N));
            }
        }
    }

    static Long recursive(int n) {
        if (dp[n] == null) {
            dp[n] = recursive(n - 2) + recursive(n - 3);
        }
        return dp[n];
    }
}