import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] weights = new int[size];
        int[] heights = new int[size];
        int[] ranks = new int[size];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            weights[i] = Integer.parseInt(st.nextToken());
            heights[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (weights[i] < weights[j] && heights[i] < heights[j]) {
                    ranks[i]+=1;
                }
            }
        }
        for(int i=0;i<size;i++){
            sb.append(ranks[i]+1).append(" ");
        }
        System.out.println(sb);
    }
}
