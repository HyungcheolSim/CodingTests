import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main{
    public static void main(String[] args) throws IOException {
        //두 분수가 주어졌을 때 그 합을 기약분수의 형태로 구하는 프로그램
        //          a1*b2+a2*b1/(b1*b2/gcd)
        //구한 후에 더이상 나눠지지 않을 때까지 약분
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
       // nu1/de1  nu2/de2
        st= new StringTokenizer(br.readLine()," ");
        int nu1=Integer.parseInt(st.nextToken());
        int de1=Integer.parseInt(st.nextToken());
        
        st= new StringTokenizer(br.readLine()," ");
        int nu2=Integer.parseInt(st.nextToken());
        int de2=Integer.parseInt(st.nextToken());
        
        //분수 계산 
        int nu3 = (nu1 * de2 + nu2 * de1);
        int de3 = de1 * de2;
        
        //분자와 분모의 최대공약수로 각각 나눠준다.
        int GCD = gcd(nu3,de3);
        sb.append(nu3/GCD).append(" ").append(de3/GCD);
        System.out.print(sb);
    }
    public static int gcd(int a, int b){
        while(b!=0){
            int r = a % b;
            
            a = b;
            b = r;
        }
        return a;
    }
}