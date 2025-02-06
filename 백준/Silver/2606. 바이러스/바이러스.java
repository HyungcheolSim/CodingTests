import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static List<Integer>[] graph;
    private static boolean chk[];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int v = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        graph = new ArrayList[v + 1];
        for (int i = 0; i <= v; i++) graph[i] = new ArrayList<>();
        chk = new boolean[v + 1];

        while (e-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a].add(b);
            graph[b].add(a);
        }

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        chk[1] = true;
        int cnt = 0;
        while (!q.isEmpty()) {
            int poll = q.poll();

            for (int i : graph[poll]) {
                if (!chk[i]) {
                    chk[i] = true;
                    cnt++;
                    q.add(i);
                }
            }
        }
        System.out.println(cnt);
    }
}