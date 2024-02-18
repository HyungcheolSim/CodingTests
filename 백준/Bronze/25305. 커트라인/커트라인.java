import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int idx = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[num];
        
        for(int i = 0; i < num; i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        
        br.close();
        Arrays.sort(arr);
        
        System.out.println(arr[num-idx]);
    }
}
