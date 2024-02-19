import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //입력
        int[] arr = new int[N];
        for(int i = 0 ; i < N ; i++){
            arr[i]=Integer.parseInt(br.readLine());
            
        }
        // 정렬
        Arrays.sort(arr);
        //출력
        for(int i=0;i<N;i++){
            bw.write(arr[i]+"\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}