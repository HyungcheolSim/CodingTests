import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str;
        while(!(str = br.readLine()).equals("0 0 0")){
            StringTokenizer st = new StringTokenizer(str," ");
            List<Integer> arr = new ArrayList<>(3);
            while(st.hasMoreTokens()){
                arr.add(Integer.parseInt(st.nextToken()));
            }
            Collections.sort(arr);
            sb.append(checkTriangle(arr)).append("\n");
        }
        System.out.println(sb);
    }
    public static String checkTriangle(List<Integer> arr){
        return arr.get(2)*arr.get(2) == arr.get(1)*arr.get(1)+arr.get(0)*arr.get(0)?"right":"wrong";
    }
}