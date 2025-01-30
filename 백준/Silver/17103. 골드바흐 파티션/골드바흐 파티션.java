import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();
    static boolean[] arr;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        getPrime(1000001);

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            getPartitionCount(N);
        }

        System.out.print(sb);
    }

    private static void getPartitionCount(int N) {
        int count = 0;
        for (int i = 2; i <= N / 2; i++) {
            if (!arr[i] && !arr[N - i]) {
                count++;
            }
        }
        sb.append(count).append("\n");
    }

    public static void getPrime(int size) {
        arr = new boolean[size];
        arr[0] = arr[1] = true;

        for (int i = 2; i <= Math.sqrt(size); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j < size; j += i) {
                arr[j] = true;
            }
        }
    }
}
