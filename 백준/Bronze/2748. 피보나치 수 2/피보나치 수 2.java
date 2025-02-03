import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		printNthFibonacci(n);

	}

	static void printNthFibonacci(long n) {
		long a = 0;
		long b = 1;

		for (long i = 0; i < n; i++) {
			long next = a + b;
			a = b;
			b = next;
		}
		System.out.println(a);
	}
}