import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Map<Integer,String> imap = new HashMap(N);
        Map<String,Integer> smap = new HashMap(N);
        
        for(int i=1;i<=N;i++){
            String str = br.readLine();
            imap.put(i,str);
            smap.put(str,i);
        }
        
        for(int i=0;i<M;i++){
            String S = br.readLine();
            if(S.charAt(0)>='A'){
                bw.write(smap.get(S)+"\n");
            }else{
                bw.write(imap.get(Integer.parseInt(S))+"\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}