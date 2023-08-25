import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] mx = {0, 0, 1, -1};
    private static final int[] my = {-1, 1, 0, 0};
    private static int width = 0;
    private static int height = 0;
    private static int[][] map;
    private static boolean[][] visited;
    private static int result = 0;

    public static void main(String[] args) throws IOException {
        int runCount = Integer.parseInt(bufferReader.readLine());

        for(int i = 0 ; i < runCount; i++){

            String[] arr = bufferReader.readLine().split(" ");
            width = Integer.parseInt(arr[0]);
            height = Integer.parseInt(arr[1]);
            int count = Integer.parseInt(arr[2]);
            result = 0;

            map = new int[height][width];
            visited = new boolean[height][width];

            for(int j = 0; j < count; j++){
                String[] point = bufferReader.readLine().split(" ");
                int w = Integer.parseInt(point[0]);
                int h = Integer.parseInt(point[1]);

                map[h][w] = 1;
            }

            for(int h = 0; h < height; h++){
                for(int w = 0; w < width; w++) {
                    if (!visited[h][w] && map[h][w] == 1) {
                        dfs(w, h);
                        result++;
                    }
                }
            }

            System.out.println(result);
        }
    }

    private static void dfs(int w, int h) {
        visited[h][w] = true;

        for(int i = 0; i < 4; i++){
            int dx = mx[i] + w;
            int dy = my[i] + h;

            if(isBoundary(dx, dy)){
                dfs(dx, dy);
            }
        }
    }

    private static boolean isBoundary(int dx, int dy){
        return width > dx && dx >= 0 && height > dy && dy >= 0 && !visited[dy][dx] && map[dy][dx] == 1;
    }
}
