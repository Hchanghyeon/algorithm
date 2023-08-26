import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static final List<List<Integer>> lines = new ArrayList<>();
    private static boolean[] visited;
    private static int count;

    public static void main(String[] args) throws IOException {

        int computer = Integer.parseInt(bufferedReader.readLine());
        int lineCount = Integer.parseInt(bufferedReader.readLine());
        visited = new boolean[computer+1];

        for(int i = 0; i <= computer; i++){
            lines.add(new ArrayList<>());
        }

        for(int i = 0; i < lineCount; i++){
            String[] line = bufferedReader.readLine().split(" ");
            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[1]);

            lines.get(num1).add(num2);
            lines.get(num2).add(num1);
        }

        bfs(1);
        System.out.println(count-1);
    }

    private static void bfs(int i) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(i);
        visited[i] = true;

        while(!queue.isEmpty()){
            int item = queue.poll();

            for(int j = 0; j < lines.get(item).size(); j++){
                int num = lines.get(item).get(j);
                if(!visited[num]){
                    queue.add(num);
                    visited[num] = true;
                }
            }
        }

        for(boolean result: visited){
            if(result){
                count++;
            }
        }
    }
}
