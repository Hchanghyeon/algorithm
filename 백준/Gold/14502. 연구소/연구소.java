import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static int[][] map;
    private static int width;
    private static int height;
    private static int[] mx = {0, 1, 0, -1};
    private static int[] my = {-1, 0, 1, 0};
    private static int max = 0;


    public static void main(String[] args) throws IOException {

        String[] size = bufferedReader.readLine().split(" ");
        height = Integer.parseInt(size[0]);
        width = Integer.parseInt(size[1]);

        map = new int[height][width];

        for(int y = 0; y < height; y++){
            String[] line = bufferedReader.readLine().split(" ");
            map[y] = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
        }

        wall(0);

        System.out.println(max);
    }

    private static void wall(int count){
        if(count == 3){
            int value = bfs();
            if(value > max){
                max = value;
            }
            return;
        }

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                if(map[y][x] == 0){
                    map[y][x] = 1;
                    wall(count + 1);
                    map[y][x] = 0;
                }
            }
        }
    }

    private static int bfs() {
        int[][] visited = new int[height][width];
        Deque<int[]> deque = new ArrayDeque<>();
        addVirus(deque);
        deepCopy(visited);
        int count = 0;

        while(!deque.isEmpty()){
            int[] point = deque.poll();

            for(int i = 0; i < 4; i++){
                int dx = mx[i] + point[0];
                int dy = my[i] + point[1];

                if(isBoundary(dx, dy, visited)){
                    deque.add(new int[]{dx, dy});
                    visited[dy][dx] = 2;
                }
            }
        }

        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                if(visited[y][x] == 0){
                    count++;
                }
            }
        }
        return count;
    }

    private static boolean isBoundary(int dx, int dy, int[][] visited) {
        return dx < width && dx >= 0 && dy < height && dy >= 0 && visited[dy][dx] == 0;
    }

    private static void addVirus(Deque deque){
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                if(map[y][x] == 2){
                    deque.add(new int[]{x,y});
                }
            }
        }
    }

    private static void deepCopy(int[][] visited){
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                visited[y][x] = map[y][x];
            }
        }
    }
}
