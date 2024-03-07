import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] ans = new int[N];
        int count = 0;
        for(int i=0;i<N;i++){
            ans[i]=Integer.parseInt(st.nextToken());
        }
        
        int[] temp = ans.clone();
        Arrays.sort(ans);
        
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0;i<ans.length;i++){
            if(!map.containsKey(ans[i]))
                map.put(ans[i],count++);
        }
        
        for(int i = 0; i < N ; i++) {
	   	 		sb.append(map.get(temp[i])).append(" ");
        }
        System.out.println(sb.toString());
    }
}
