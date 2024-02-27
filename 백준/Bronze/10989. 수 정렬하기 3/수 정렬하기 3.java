import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //나올 수 있는 숫자의 범위+1 의 크기를 갖는 배열
        int[] cnt = new int[10001];
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            cnt[Integer.parseInt(br.readLine())]++;
        }
        br.close();
       
        for(int i=1;i< 10001;i++){ 
            //값이 없을 때 스킵하기
            if(cnt[i]==0) continue;
            //repeat로 반복문 제거
            bw.write((i+"\n").repeat(cnt[i]));
        }
        bw.flush();
        bw.close();
    }
}