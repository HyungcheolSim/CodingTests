import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        System.out.println(recursive(N,0));
        br.close();
    }
    static int recursive(int N,int count){
        if(N<2){
            return count;
        }
        return Math.min(recursive(N / 2, count + 1 + (N % 2)), recursive(N / 3, count + 1 + (N % 3)));
    }
}