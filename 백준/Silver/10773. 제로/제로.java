import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Integer> q = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int number = Integer.parseInt(br.readLine());
            if (number == 0) {
                q.remove(q.size()-1);
            } else {
                q.add(number);
            }
        }
        int sum = 0;
        for(int i=0;i<q.size();i++){
            sum += q.get(i);
        }
        System.out.println(sum);
    }
}