import java.io.*;

public class Main {
    static BufferedReader br;
    static BufferedWriter bw;
    static int T;
    static boolean[] arr;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));

        T = Integer.parseInt(br.readLine());
        getPrime(10001);

        while (T-- > 0) {
            int cur = Integer.parseInt(br.readLine());
            for (int i = cur / 2; i >= 2; i--) {
                if (!arr[i] && !arr[cur - i]) {
                    bw.write(i + " " + (cur - i) + "\n");
                    break;
                }
            }
        }
        bw.flush();
        bw.close();
    }


    public static void getPrime(int size) {
        arr = new boolean[size];
        arr[0] = arr[1] = true;

        for (int i = 2; i <= Math.sqrt(size); i++) {
            if (arr[i]) continue;
            for (int j = i * i; j < size; j += i) {
                arr[j] = true;
            }
        }
    }
}
