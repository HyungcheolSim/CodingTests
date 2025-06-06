import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static Integer[][] dp;
    static int[][] arr;
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         n =Integer.parseInt(br.readLine());
        arr = new int[n][n];
        dp = new Integer[n][n];
        StringTokenizer st;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j <i+1; j++){
                arr[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        //초기화 완료
        for (int i = 0; i < n; i++) {
            dp[n - 1][i] = arr[n - 1][i];
        }

        System.out.println(find(0, 0));

    }

    static int find(int depth, int idx) {
        if(depth == n - 1) return dp[depth][idx];
        if (dp[depth][idx] == null) {
            dp[depth][idx] = Math.max(find(depth + 1, idx), find(depth + 1, idx + 1)) + arr[depth][idx];
        }
        return dp[depth][idx];
    }
}