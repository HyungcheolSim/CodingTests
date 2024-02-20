import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i=0;i<N;i++){
            if(checkGroupWord(br.readLine()))
                count++;
        }
        System.out.print(count);
    }
    public static boolean checkGroupWord(String str){
        //각 문자가 연속해서 나오지 않는 경우
        char bef='1';
        Set<Character> alp = new HashSet();
        
        for(int i = 0 ; i < str.length() ; i++){
            char now = str.charAt(i);
            
            if(bef!=now){
                if(!alp.contains(now)){
                    alp.add(now);
                    bef=now;
                }else{
                    return false;
                }
            }else{
                continue;
            }
        }
        return true;
    }
}