import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        long answer = 0;
        int seq = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        for (char ch : br.readLine().toCharArray()) {
            int i = ch - 'a';
            i++;
            answer += (i * (long) (Math.pow(31, seq++)));
        }
        System.out.print(answer);
    }
}