import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < count; i++){
            Deque<String> deque = new ArrayDeque<>();
            String[] line = bufferedReader.readLine().split("");
            boolean flag = false;

            for(int j = 0; j < line.length; j++){
                if(line[j].equals("(")){
                    deque.add(line[j]);
                    continue;
                }

                if(deque.isEmpty()){
                    flag = true;
                    break;
                }

                deque.pop();
            }

            if(!deque.isEmpty() || flag){
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");
        }
    }
}
