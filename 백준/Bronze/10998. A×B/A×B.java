import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num1 = Character.digit(br.read(),10);
        br.read();
        int num2 = Character.digit(br.read(),10);
        System.out.println(num1*num2);
    }
}