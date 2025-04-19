import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 수 N 개 i 부터 J 번째 수 까지의 합
		// 합을 구해야하는 횟수 M
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int[] numArr = new int[N + 1];
		// 둘째 줄에는 N 개의 수
		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			numArr[i] = numArr[i - 1] + Integer.parseInt(st.nextToken());
		}

		for (int j = 0; j < M; j++) {
			st = new StringTokenizer(br.readLine());
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			sb.append(numArr[J] - numArr[I - 1]).append("\n");
		}
		System.out.println(sb);
	}
}
