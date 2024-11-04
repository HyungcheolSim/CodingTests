import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] str= br.readLine().split(" ");
        int num1= Integer.parseInt(str[0]);
        int num2= Integer.parseInt(str[1]);
        StringBuilder sb = new StringBuilder();
        sb.append(num1+num2).append("\n").append(num1-num2).append("\n")
                .append(num1*num2).append("\n").append(num1/num2).append("\n").append(num1%num2);
        System.out.println(sb);
    }
}
