import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int T= scan.nextInt();
        for(int i=0;i<T;i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            
            //두 수의 곱/최대공약수 = 최소공배수
            int GCD=0;
            int big=A >= B ? A : B ;
            for(int k=1;k<=big;k++){
                if(A % k == 0 && B % k == 0){
                    if(GCD<k){
                        GCD=k;
                    }
                }
            }
            int answer= (A * B) / GCD;
            System.out.printf("%d\n",answer);
        }
    }
}