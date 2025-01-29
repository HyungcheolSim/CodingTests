import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static BufferedReader br;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long n = Long.parseLong(st.nextToken());
        long m = Long.parseLong(st.nextToken());

        long five = get_pow(5, n) - get_pow(5, m) - get_pow(5, n - m);
        long two = get_pow(2, n) - get_pow(2, m) - get_pow(2, n - m);
        System.out.println(Math.min(five, two));

    }

    static long get_pow(int pow, long num) {
        int count = 0;
        while (num >= pow) {
            count += (num / pow);
            num /= pow;
        }
        return count;
    }
}