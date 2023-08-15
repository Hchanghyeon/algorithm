import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static boolean flag = false;
    private static final Scanner scanner = new Scanner(System.in);
    private static List<Integer> results = new ArrayList<>();
    private static int[] my = {-1, -1, 0, 1, 1, 1, 0, -1};
    private static int[] mx = {0, 1, 1, 1, 0, -1, -1, -1};
    private static int count = 0;

    public static void main(String[] args) {

        while(!flag){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[][] map = new int[y][x];
            int result = 0;
            int width = x;
            int height = y;

            if(x == 0 && y == 0){
                break;
            }

            for(int i = 0; i < y; i++){
                for(int j = 0; j < x; j++){
                    map[i][j] = scanner.nextInt();
                }
            }

            for(int i = 0; i < y; i++){
                for(int j = 0; j < x; j++){
                    if(map[i][j] == 1){
                        map[i][j] = 0;
                        dfs(map, i, j, width, height);
                        result++;
                    }
                }
            }

            results.add(result);
        }

        for (Integer result : results) {
            System.out.println(result);
        }
    }


    private static void dfs(int[][] map, int y, int x, int width, int height){

        for(int i = 0; i < 8; i++){
            int dy = y + my[i];
            int dx = x + mx[i];

            if(isBoundry(width, height, dx, dy, map)){
                map[dy][dx] = 0;
                dfs(map, dy, dx, width, height);
            }
        }
    }

    private static boolean isBoundry(int width, int height, int dx, int dy, int[][] map){
        return dy >= 0 && dy < height && dx >= 0 && dx < width && map[dy][dx] == 1;
    }

}
