import java.io.*;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int aScore = Integer.parseInt(st.nextToken());
        int bScore = Integer.parseInt(st.nextToken());

        System.out.println(aScore^bScore);
        br.close();
    }
}
