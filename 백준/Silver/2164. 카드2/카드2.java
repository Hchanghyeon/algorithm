import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static final Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 1; i <= count; i++){
            deque.add(i);
        }

        while(deque.size() > 1){
            deque.removeFirst();
            deque.add(deque.poll());
        }

        System.out.println(deque.peek());
    }
}
