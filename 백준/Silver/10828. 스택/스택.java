import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Deque<Integer> stack = new ArrayDeque<Integer>();

		for(int i=0;i<size;i++) {
			st = new StringTokenizer(br.readLine());
			String command = st.nextToken();
			if(command.equals("push"))
				stack.push(Integer.parseInt(st.nextToken()));
			else if(command.equals("top")) {
				sb.append(stack.isEmpty()?-1:stack.peek()).append("\n");
			}else if(command.equals("size")) {
				sb.append(stack.size()).append("\n");
			}else if(command.equals("empty")) {
				sb.append(stack.isEmpty()?1:0).append("\n");
			}else {
				sb.append(stack.isEmpty()?-1:stack.pop()).append("\n");
			}
		}
		System.out.println(sb);
	}
}