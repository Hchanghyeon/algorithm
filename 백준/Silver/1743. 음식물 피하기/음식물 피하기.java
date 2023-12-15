import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] dx = {0, 1, 0, -1};
    private static final int[] dy = {-1, 0, 1, 0};
    private static int[][] map;
    private static boolean[][] visited;
    private static int result = 0;
    private static int height = 0;
    private static int width = 0;
    private static Deque<int[]> deque = new ArrayDeque<>();

    public static void main(String[] args) throws IOException {
        String[] input = bufferedReader.readLine().split(" ");

        height = Integer.parseInt(input[0]);
        width = Integer.parseInt(input[1]);
        int count = Integer.parseInt(input[2]);

        map = new int[height][width];
        visited = new boolean[height][width];

        for(int i = 0; i < count; i++){
            String[] line = bufferedReader.readLine().split(" ");
            int y = Integer.parseInt(line[0]) - 1;
            int x = Integer.parseInt(line[1]) - 1;

            map[y][x] = 1;
        }

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    int maxCount = bfs(i, j);
                    if(maxCount > result) result = maxCount;
                }
            }
        }

        System.out.println(result);
    }

    private static int bfs(int i, int j) {
        deque.clear();
        deque.add(new int[] {i, j});
        int count = 0;

        while(!deque.isEmpty()){
            int[] next = deque.poll();
            visited[next[0]][next[1]] = true;
            count++;

            for(int k = 0; k < 4; k++){
                int mx = next[1] + dx[k];
                int my = next[0] + dy[k];

                if(mx >= 0 && my >= 0 && mx < width && my < height && !visited[my][mx] && map[my][mx] == 1){
                    deque.add(new int[]{my, mx});
                    visited[my][mx] = true;
                }
            }
        }

        return count;
    }
}
