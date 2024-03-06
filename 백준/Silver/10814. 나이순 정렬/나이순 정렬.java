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
        String[][] arr = new String[N][2];
        
        //입력
        for(int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			arr[i][0] = st.nextToken();	
			arr[i][1] = st.nextToken();	
        }
        //정렬
        Arrays.sort(arr,new Comparator<String[]>() {
			
			@Override
			public int compare(String[] s1, String[] s2) {
				return Integer.parseInt(s1[0]) - Integer.parseInt(s2[0]);
			}
		});

        //출력
        for(int i=0;i<arr.length;i++){
            bw.write(arr[i][0]+" "+arr[i][1]);
            bw.newLine();
        }
        br.close();
        bw.flush();
        bw.close();
    }
}