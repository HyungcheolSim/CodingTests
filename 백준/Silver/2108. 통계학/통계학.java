import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        print(getArithmeticMean(arr));
        print(getMedian(arr));
        print(getMode(arr));
        print(getRange(arr));
    }
    private static void print(int i) {
        System.out.println(i);
    }
    private static int getArithmeticMean(int[] arr) {
        double sum = 0;
        for (int n : arr) {
            sum += n;
        }
        return (int) Math.round(sum/arr.length);
    }

    private static int getMedian(int[] arr) {
        Arrays.sort(arr);
        return arr[ arr.length/ 2];
    }

    private static int getMode(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int key : arr) {
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int max = Collections.max(map.values());

        List<Integer> answers = new ArrayList<>();
        for (int key : map.keySet()) {
            if (map.get(key) == max) {
                answers.add(key);
            }
        }
        if (answers.size() > 1) {
            Collections.sort(answers);
            return answers.get(1);
        }else{
            return answers.get(0);
        }
        
    }
    private static int getRange(int[] arr) {
        Arrays.sort(arr);
        return Math.abs(arr[arr.length - 1] - arr[0]);
    }
}
