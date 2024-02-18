import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main{
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 종말의 수란 어떤 수에 6이 3개이상 연속으로 들어가는 수 
        // n번째 영화의 제목은 세상의 종말 n번째로 작은 종말의 수
        int idx=1;
        int DN=666;
        while(idx != N){
            DN++;
            if(String.valueOf(DN).contains("666")){
                idx++;
            }
        }
        System.out.println(DN);
    }
}