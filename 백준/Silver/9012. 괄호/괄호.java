import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            sb.append(checkVPS(str)).append("\n");
        }
        System.out.print(sb);
    }

    static String checkVPS(String str) {
        if (str.length() % 2 != 0) return "NO";
        if (str.indexOf(0) == ')' || str.indexOf(str.length() - 1) == '(') return "NO";

        int current=0;
        for(char ch : str.toCharArray()){
            if(ch=='('){
                current++;
            }else{
                if(current>0){
                    current--;
                }else{
                    return "NO";
                }
            }
        }
        return current == 0 ? "YES" : "NO";
    }
}
