import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[6];
        int i = 0;

        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine(), " ");
        int shirtsPair = Integer.parseInt(st.nextToken());
        int penPair = Integer.parseInt(st.nextToken());

        sb.append(getShirtsPair(arr, shirtsPair)).append("\n");

        int P = N / penPair;
        int R = N % penPair;
        sb.append(P).append(" ").append(R);
        System.out.println(sb);
    }

    public static int getShirtsPair(int[] arr, int shirtsPair) {
        int cnt = 0;
        for (int i : arr) {
            if (i > 0) {
                cnt += (i / shirtsPair);
                if (i % shirtsPair > 0)
                    cnt++;
            }
        }
        return cnt;
    }
}