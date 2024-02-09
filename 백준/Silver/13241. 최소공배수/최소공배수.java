import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args)throws IOException {
        //두 수의 최소 공배수 구하기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        
        long GCD = gcd(a,b);
        
        sb.append(a * b / GCD);
        
        System.out.print(sb);
    }
    public static long gcd(long a, long b){
        while(b!=0){
            long r = a % b;
            
            a = b;
            b = r;
        }
        return a;
    }
    
}