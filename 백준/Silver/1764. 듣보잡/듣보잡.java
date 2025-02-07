import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(br.readLine());
        }

        TreeSet<String> resultSet = new TreeSet<>();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (set.contains(str)) {
                resultSet.add(str);
            }
        }

        bw.write(resultSet.size() + "\n");
        for (String str : resultSet) {
            bw.write(str + "\n");
        }
        bw.flush();
        bw.close();
    }
}
