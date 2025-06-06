import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        StringBuilder sb = new StringBuilder();
        int answer=0;
        for(int i=1;i<=5;i++){
            int num=Integer.parseInt(st.nextToken());
            answer+= num*num;
        }
        System.out.print(answer%10);
    }
}