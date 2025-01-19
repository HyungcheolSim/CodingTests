import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sum = 0;
        int cutIdx = (int) Math.round(N * 0.15);
        for (int i = cutIdx; i < N - cutIdx; i++) {
            sum += arr[i];
        }
        int etc = N - (2 * cutIdx);
        int result = (etc > 0) ? (int) Math.round((double) sum / etc) : 0;
        System.out.println(result);
    }
}
