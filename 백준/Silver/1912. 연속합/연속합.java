import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static Integer[] dp;
    static int[] arr;
    static int max;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        arr = new int[T];
        dp = new Integer[T];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        dp[0] = arr[0];
        max = arr[0];
        plus(T-1);
        System.out.println(max);
    }

    static int plus(int n) {
        if (dp[n] == null) {
            dp[n] = Math.max(plus(n - 1) + arr[n], arr[n]);
            max = Math.max(dp[n],max);
        }
        return dp[n];
    }
}