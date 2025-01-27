import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int S, E;
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        S = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        for (int num = S; num <= E; num++) {
            int size = getPrimeFact(num);
            if (isPrime(size))
                count++;
        }
        System.out.println(count);
    }

    static int getPrimeFact(int num) {
        int count = 0;

        for (int d = 2; d <= Math.sqrt(num); d++) {
            while (num % d == 0) {
                num /= d;
                count++;
            }
        }
        if (num != 1) count++;
        return count;
    }

    static boolean isPrime(int underPrime) {
        if (underPrime < 2) return false;
        for (int i = 2; i <= Math.sqrt(underPrime); i++) {
            if (underPrime % i == 0) return false;
        }
        return true;
    }
}