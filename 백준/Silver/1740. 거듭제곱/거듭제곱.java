import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
       long input = Long.parseLong(br.readLine());

        long ans = 0L;
        while (input > 0L) {
            long tempCnt = 0L;
            long num = 1L;
            while (input >= num * 2L) {
                num *= 2L;
                tempCnt++;
            }
            input -= num;

            long powNum = 1L;
            for (int i = 0; i < tempCnt; i++) {
                powNum *= 3;
            }
            ans += powNum;
        }
        System.out.println(ans);
    }
}