import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] size = bufferedReader.readLine().split(" ");
        int width = Integer.parseInt(size[1]);
        int height = Integer.parseInt(size[0]);
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};

        String result = "NO";

        int[][] map = new int[height][width];
        boolean[][] visited = new boolean[height][width];

        for(int i = 0; i < height; i++){
            map[i] = Arrays.stream(bufferedReader.readLine().split(""))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }

        Deque<int[]> deque = new ArrayDeque<>();

        for(int i = 0; i < width; i++){
            if(map[0][i] == 0){
                deque.add(new int[]{0, i});
            }
        }

        while(!deque.isEmpty()){
            int[] next = deque.poll();

            for(int i = 0; i < 4; i++){
                int mx = next[1] + dx[i];
                int my = next[0] + dy[i];

                if(mx >= 0 && my >= 0 && mx < width && my < height && map[my][mx] != 1 && !visited[my][mx]){
                    visited[my][mx] = true;
                    deque.add(new int[]{my, mx});
                }
            }
        }

        for(int i = 0; i < width; i++){
            if(visited[height-1][i]){
                result = "YES";
            }
        }

        System.out.println(result);
    }
}
