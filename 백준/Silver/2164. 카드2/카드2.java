import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = IntStream.rangeClosed(1,N).boxed().collect(Collectors.toCollection(LinkedList::new));
        while(deque.size()>1){
            deque.pollFirst();
            deque.addLast(deque.pollFirst());
        }
        System.out.print(deque.peek());
    }
}
