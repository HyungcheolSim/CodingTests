import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("push")) queue.push(Integer.parseInt(st.nextToken()));
            else if (command.equals("pop")) {
                sb.append(queue.isEmpty() ? -1 : queue.pollLast()).append("\n");
            } else if (command.equals("size")) {
                sb.append(queue.size()).append("\n");
            } else if (command.equals("empty")) {
                sb.append(queue.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("front")) {
                sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
            } else {
                sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
            }
        }
        System.out.println(sb);
    }
}