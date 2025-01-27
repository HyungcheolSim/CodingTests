import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        boolean[] prime = new boolean[E + 1];
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for (int j = i * i; j < prime.length; j += i) {
                prime[j] = true;
            }
        }
        int count = 0;

        for (int num = S; num <= E; num++) {

            if (prime[num]) {
                int size = getPrimeFact(num);
                if ( size>0 && !prime[size])
                    count++;
            }
        }
        System.out.println(count);
    }

    static int getPrimeFact(int num) {
        int count = 0;
        int i = 2;
        while (num > 1) {
            if (num % i == 0) {
                num /= i;
                count++;
            }else{
                i++;
            }
        }
        return count;
    }
}
