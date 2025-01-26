import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int E = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        if (E == 1 && S == 1 && M == 1) {
            System.out.println(1);
            return;
        }
        int i = 2;
        while (true) {
            int subE = i % 15;
            if (subE == 0) subE = 15;
            int subS = i % 28;
            if (subS == 0) subS = 28;
            int subM = i % 19;
            if (subM == 0) subM = 19;
            if (subE == E && subS == S && subM == M) break;
            i++;
        }
        System.out.println(i);
    }
}
