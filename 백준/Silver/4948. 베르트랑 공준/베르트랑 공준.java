import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
     public static boolean[] prime = new boolean[246913];
    public static int[] count_arr = new int[246913];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        getPrime();
        getCount();

        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            sb.append(count_arr[2 * N]- count_arr[N]).append(("\n"));
        }
        System.out.println(sb);
    }

    public static void getPrime() {
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if (prime[i]) continue;
            for(int j = i*i; j<prime.length; j+=i) {
                prime[j]= true;
            }
        }
    }
    public static void getCount(){
        int count = 0;
        for(int i = 2; i<prime.length;i++){
            if(!prime[i]) count++;

            count_arr[i] = count;
        }
    }
}
