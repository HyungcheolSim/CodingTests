import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int[] nNums = new int[N];
        for(int i=0;i<N;i++){
            nNums[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nNums);
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine()," ");

        for(int i=0;i<M;i++){
            if(Arrays.binarySearch(nNums,Integer.parseInt(st.nextToken())) >= 0) {
				bw.write("1");
			}
			else {
				bw.write("0");
			}
            bw.newLine();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}