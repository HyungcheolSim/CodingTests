import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] answer = new int[N];
        int sum=0;
        int before = 0;
        for(int i=0;i<N;i++){
            answer[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(answer);
        for(int i=0;i<N;i++){
            sum+=before + answer[i];
            before+=answer[i];
        }
        System.out.println(sum);
    }
}