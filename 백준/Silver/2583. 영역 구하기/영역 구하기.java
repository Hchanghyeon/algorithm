import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    private static final int[] mx = {0, 1, 0, -1};
    private static final int[] my = {-1, 0, 1, 0};
    private static int count = 0;
    private static final List<Integer> results = new ArrayList<>();
    private static int width = 0;
    private static int height = 0;

    public static void main(String[] args) throws IOException {

        String[] firstLine = buffer.readLine().split(" ");

        height = Integer.parseInt(firstLine[0]);
        width = Integer.parseInt(firstLine[1]);
        int rectangle = Integer.parseInt(firstLine[2]);

        int[][] map = new int[height][width];

        for(int i = 0; i < rectangle; i++){
            String[] points = buffer.readLine().split(" ");

            for(int j = Integer.parseInt(points[1]); j < Integer.parseInt(points[3]); j++){
                for(int k = Integer.parseInt(points[0]); k < Integer.parseInt(points[2]); k++){
                    map[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                if(map[i][j] == 0){
                    dfs(map, i, j);
                    results.add(count);
                    count = 0;
                }
            }
        }

        System.out.println(results.size());
        Collections.sort(results);
        List<String> stringList = results.stream().map(String::valueOf).collect(Collectors.toList());
        System.out.print(String.join(" ", stringList));
    }

    private static void dfs(int[][] map, int y, int x) {
        count++;
        map[y][x] = 1;

        for(int i = 0; i < 4; i++){
            int dy = y + my[i];
            int dx = x + mx[i];
            if(isInBoundary(map, dy, dx)){
                dfs(map, dy, dx);
            }
        }
    }

    private static boolean isInBoundary(int[][] map, int y, int x) {
        return (width > x && x >= 0) && (y < height && y >= 0) && map[y][x] == 0;
    }

}
