import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
//가로수들이 모두 같은 간격이 되도록 추가로 더 심는다.
//가장 적은 수의 나무
// 가로수의 위치는 모두 양의 정수
// 배열 내 수들의 가장 적은 간격 구하기
// 가장 마지막 요소/
// 첫 입력값 :전체 반복수(심어진 나무 수)
public class Main{
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        // 배열에 넣기
        int[] ans = new int[T];
        for(int i=0;i<T;i++){
            ans[i]=Integer.parseInt(br.readLine());
        }
        br.close();
        //최소 간격을 구하는 방법(GCD)
        int GCD=0;
        for(int i=0;i<T-1;i++){
            int dif2= ans[i+1]-ans[i];
            GCD=gcd(dif2,GCD);
        }
        // (마지막 나무 위치/간격(GCD))-T -> 더 심어야 하는 나무 수
        int answer = (ans[T-1]-ans[0]) / GCD - T + 1;
        System.out.print(answer);
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