import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static char[][] map;
    private static boolean[][] visited;
    private static final int mx[] = {0, 0, -1, 1};
    private static final int my[] = {1, -1, 0, 0};
    private static int count = 0;
    private static List<Character> characters = new ArrayList<>();
    private static int height = 0;
    private static int width = 0;

    public static void main(String[] args) throws IOException {
        String[] name = bufferedReader.readLine().split(" ");
        height = Integer.parseInt(name[0]);
        width = Integer.parseInt(name[1]);

        map = new char[height][width];
        visited = new boolean[height][width];

        for(int i = 0; i < height; i++){
            map[i] = bufferedReader.readLine().toCharArray();
        }

        dfs(0, 0);

        System.out.println(count);
    }
    private static void dfs(int x, int y) {
        if(characters.contains(map[y][x])){
            return;
        }

        characters.add(map[y][x]);

        if(characters.size() > count){
            count = characters.size();
        }

        for(int i = 0; i < 4; i++){
            int dx = mx[i] + x;
            int dy = my[i] + y;

            if(isBoundary(dx, dy)){
                dfs(dx, dy);
            }
        }

        characters.remove(Character.valueOf(map[y][x]));
    }

    private static boolean isBoundary(int dx, int dy) {
        return dx < width && dx >= 0 && dy < height && dy >= 0;
    }
}
