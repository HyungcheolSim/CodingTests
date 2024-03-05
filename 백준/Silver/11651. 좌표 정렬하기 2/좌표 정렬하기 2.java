import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //2차원 평면 위의 점 n개
        //x좌표가 증가하는 순, x좌표가 같으면 y좌표가 증가하는 순으로 정렬
        //입력
        int N = Integer.parseInt(br.readLine());
        int[][] answer = new int[N][2];
        for(int i=0;i<N;i++){
            String[] arr=br.readLine().split(" ");
            answer[i][0]=Integer.parseInt(arr[0]);
            answer[i][1]=Integer.parseInt(arr[1]);
        }
        //정렬
        Arrays.sort(answer,(o1,o2)->{
            if(o1[1]==o2[1])
                return Integer.compare(o1[0],o2[0]);
            else
                return Integer.compare(o1[1],o2[1]);
        });
        
        for(int i=0;i<answer.length;i++){
            bw.write(answer[i][0]+" "+answer[i][1]);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}