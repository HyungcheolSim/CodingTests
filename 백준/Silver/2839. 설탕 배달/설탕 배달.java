import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp = new Integer[N + 1];
        dp[0] = dp[1] = 0;
        System.out.println(recur(N));
    }

    static int recur(int N) {
        if (dp[N] == null) {
            if (N == 4 || N == 7) {
                return -1;
            } else if (N % 5 == 0) {
                return N / 5;
            } else if (N % 5 == 1 || N % 5 == 3) {
                return N / 5 + 1;
            } else if (N % 5 == 2 || N % 5 == 4) {
                return N / 5 + 2;
            }
        }
        return dp[N];
    }
}
