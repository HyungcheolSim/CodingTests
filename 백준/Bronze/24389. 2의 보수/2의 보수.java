import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        int count = Integer.toBinaryString(n ^ (~n+1)).replace('0',' ').trim().length();
        System.out.println(count);
        br.close();
    }
}
