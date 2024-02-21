import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;


public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n, m;
        HashMap<String, Integer> owned = new HashMap<>();

        n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            owned.put(st.nextToken(), 0);
        }

        m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<m; i++) {
            if (owned.get(st.nextToken()) != null) {
                sb.append("1 ");
            } else {
                sb.append("0 ");
            }
        }
        System.out.print(sb.toString());
    }
}