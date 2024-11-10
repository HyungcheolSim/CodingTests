import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        for (int i=0;i<8;i++){
            sb.append(st.nextToken());
        }

        String answer;
        if(sb.toString().equals("12345678")){
            answer="ascending";
        }else if(sb.toString().equals("87654321")){
            answer="descending";
        }else{
            answer="mixed";
        }
        System.out.print(answer);
    }
}
