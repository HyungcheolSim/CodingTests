import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int M = -1;
        double sum = 0.0;
        for(int i=0;i<N;i++){
            int num=Integer.parseInt(st.nextToken());
            if(num>M)
                M=num;
            sum += num;
        }
        
        System.out.println(((sum/M)*100.0)/N);
    }
}