import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 동전의 종류 N, 동전의 조합의 합 K 이 때 필요한 동전 개수의 최솟값을 구하는 프로그램
		String[] firstRow = br.readLine().split(" ");
		int N = Integer.parseInt(firstRow[0]);
		int K = Integer.parseInt(firstRow[1]);
		int[] coins = new int[N];
		for (int i = 0; i < N; i++) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		// 초기화 끝

		// K원을 만드는 동전 개수의 최솟값
		// 큰 수부터 작은 수로 가며 큰 숫자 * n
		int count = 0;
		for (int i = N - 1; i >= 0; i--) {
			if (coins[i] <= K) {
				count += (K / coins[i]);
				// coins[i] 가 K 보다 작으면 + 1이 안되므로 count 가 그대로, 해당 자리수의 동전을 여러개 쓸 수 있으면 여러 개 입력
				// 가능함
				K = K % coins[i]; // K값을 큰 수부터 깎아가며 비교
			}
		}
		System.out.println(count);
	}
}
