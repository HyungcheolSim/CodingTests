import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        dp = new Integer[1001];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 3;

        for (int i = 3; i <= T; i++)
            dp[i] = (dp[i - 1] + 2 * dp[i - 2]) % 10007;

        System.out.println(dp[T]);
    }
}