import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[3];
        int i = 0;

        while (st.hasMoreTokens()) {
            arr[i++] = Long.parseLong(st.nextToken());
        }
        long sum = arr[0]+arr[1]+arr[2];
        System.out.println(sum);
    }
}
