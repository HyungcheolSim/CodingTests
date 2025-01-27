import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int A = 0, B = 0;
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());

            for (int p = 2; p <= (n / 2); p++) {
                if (isPrime(p) && isPrime(n - p)) {
                    A = p;
                    B = n - p;
                }
            }
            System.out.println(A + " " + B);
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
