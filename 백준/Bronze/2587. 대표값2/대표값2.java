import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr= new int[5];
        int sum=0;
        for(int i=0;i<5;i++){
            arr[i]=Integer.parseInt(br.readLine());    
            sum+=arr[i];
        }
        Arrays.sort(arr);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.flush();
        bw.write(sum/5+"\n");
        bw.write(arr[2]+"");
        bw.newLine();
        bw.flush();
        bw.close();
        br.close();
        
         //5개의 자연수가 주어질때 평균과 중앙값을 구하자.
        //평균: 다 더해서/5 중앙값: 정렬해서 가운데 오는 수(idx=2)
    }
}