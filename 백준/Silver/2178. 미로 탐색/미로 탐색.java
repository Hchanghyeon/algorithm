import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
import java.util.stream.Collectors;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static int height = 0;
    private static int width = 0;
    private static int[][] map;
    private static int[][] visited;
    private static final int[] mx = {0, 1, 0, -1};
    private static final int[] my = {-1, 0, 1, 0};

    public static void main(String[] args) throws IOException {

        StringTokenizer token = new StringTokenizer(bufferedReader.readLine());

        height = Integer.parseInt(token.nextToken());
        width = Integer.parseInt(token.nextToken());

        map = new int[height][width];
        visited = new int[height][width];

        for(int i = 0; i < height; i++){
            String[] arr = bufferedReader.readLine().split("");
            map[i] = Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
        }

        bfs(0, 0);

        System.out.println(visited[height-1][width-1]);
    }

    private static void bfs(int w, int h) {
        Queue<List<Integer>> queue = new LinkedList<>();
        queue.add(new ArrayList<>(Arrays.asList(w, h)));
        visited[h][w] = 1;

        while(!queue.isEmpty()){
            List<Integer> point = queue.poll();

            for(int i = 0; i < 4; i++){
                int dx = mx[i] + point.get(0);
                int dy = my[i] + point.get(1);

                if(isBoundary(dx, dy)){
                    queue.add(new ArrayList<>(Arrays.asList(dx, dy)));
                    visited[dy][dx] = visited[point.get(1)][point.get(0)] + 1;
                }
            }
        }
    }

    private static boolean isBoundary(int dx, int dy) {
        return dx < width && dx >= 0 && dy < height && dy >= 0 && map[dy][dx] != 0 && visited[dy][dx] == 0;
    }

}
