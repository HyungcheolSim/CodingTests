import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        long input = Long.parseLong(br.readLine());

        long ans = 0L;
        String str = Long.toBinaryString(input);
        int cnt = 0;
        for (int i = str.length() - 1; i >= 0; i--, cnt++) {
            if (str.charAt(i) == '0') {
                continue;
            }

            long subsum = 1;
            for (int w = 0; w < cnt; w++) {
                subsum *= 3;
            }
            ans += subsum;
        }
        System.out.println(ans);
    }
}