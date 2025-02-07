import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<n+m;i++){
            String name = br.readLine();
            if(map.containsKey(name)){
                map.put(name,map.get(name)+1);
            }else{
                map.put(name,1);
            }
        }
        Map<String, Integer> result = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 2) {
                result.put(entry.getKey(), entry.getValue());
            }
        }
        StringBuilder sb = new StringBuilder();
        int size =result.size();
        sb.append(size).append("\n");
        List<String> answerArr = new ArrayList<>(result.keySet());
        Collections.sort(answerArr);
        for(String name:answerArr){
            sb.append(name).append("\n");
        }
        System.out.println(sb);
    }
}
