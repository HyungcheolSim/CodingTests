import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    private static BufferedReader br;

    public static void main(String[] args) throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[T];
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < T; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
            set.add(nums[i]);
        }
        int x = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < T; i++) {
            if (set.contains(x - nums[i])) count++;
        }
        System.out.println(count/2);
    }
}
