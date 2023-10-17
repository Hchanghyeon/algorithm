import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        Deque<Integer> stack = new ArrayDeque<>();

        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < count; i++){
            String[] line = bufferedReader.readLine().split(" ");

            String action = line[0];
            switch (action){
                case "push": {
                    int number = Integer.parseInt(line[1]);
                    stack.add(number);
                    break;
                }
                case "pop": {
                    if(!stack.isEmpty()) {
                        System.out.println(stack.removeLast());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                }
                case "size": {
                    System.out.println(stack.size());
                    break;
                }
                case "empty": {
                    if(stack.isEmpty()){
                        System.out.println(1);
                    } else {
                        System.out.println(0);
                    }
                    break;
                }
                case "top": {
                    if(!stack.isEmpty()){
                        System.out.println(stack.getLast());
                    } else {
                        System.out.println(-1);
                    }
                    break;
                }
            }
        }
    }
}
