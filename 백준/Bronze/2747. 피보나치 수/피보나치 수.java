import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		printNthFibonacci(n);

	}

	static void printNthFibonacci(int n) {
		int a = 0;
		int b = 1;

		for (int i = 0; i < n; i++) {
			int next = a + b;
			a = b;
			b = next;
		}
		System.out.println(a);
	}
}