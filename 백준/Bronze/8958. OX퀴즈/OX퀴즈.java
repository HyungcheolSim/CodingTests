import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testSize = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb =new StringBuilder();
        for (int i = 0; i < testSize; i++) {
            int sum =0;
            String testAnswer = br.readLine().replace("X", " ");
            st = new StringTokenizer(testAnswer, " ");
            while(st.hasMoreTokens()){
                sum+=getComboScore(st.nextToken());
            }
            sb.append(sum).append("\n");
        }
        System.out.println(sb);
    }
    static int getComboScore(String st){
        int sum =0;
        for(int i=1;i<=st.length();i++){
            sum+=i;
        }
        return sum;
    }
}