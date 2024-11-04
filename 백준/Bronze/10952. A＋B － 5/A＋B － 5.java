import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        while(true){
            String str = br.readLine();
            int num1 = Character.digit(str.charAt(0),10);
            int num2 = Character.digit(str.charAt(2),10);
            if(num1==0&&num2==0){
                System.out.println(sb);
                break;
            }
            sb.append(num1+num2+"\n");
        }
    }
}