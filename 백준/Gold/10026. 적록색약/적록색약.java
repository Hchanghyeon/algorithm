import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static char[][] map;
    private static int[][] normalVisited;
    private static int[][] weaknessVisited;
    private static int N = 0;
    private static final int[] dx = {0,1,0,-1};
    private static final int[] dy = {-1,0,1,0};

    public static void main(String[] args) throws IOException {

        N = Integer.parseInt(bufferedReader.readLine());
        map = new char[N][N];
        normalVisited = new int[N][N];
        weaknessVisited = new int[N][N];
        int normalCount = 0;
        int weaknessCount = 0;

        for(int i = 0; i < N; i++){
            map[i] = bufferedReader.readLine().toCharArray();
        }

        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(normalVisited[i][j] == 0){
                    dfs(j, i, map[i][j], false);
                    normalCount++;
                }

                if(weaknessVisited[i][j] == 0){
                    dfs(j, i, map[i][j], true);
                    weaknessCount++;
                }
            }
        }

        System.out.println(normalCount + " " + weaknessCount);
    }

    private static void dfs(int x, int y, char color, boolean flag){
        if(!flag){
            normalVisited[y][x] = 1;
        } else {
            weaknessVisited[y][x] = 1;
        }

        for(int i = 0; i < 4; i++){
            int mx = x + dx[i];
            int my = y + dy[i];

            if(isBoundary(mx, my, color, flag)){
                dfs(mx, my, color, flag);
            }
        }
    }

    private static boolean isBoundary(int x, int y, char color, boolean flag){
        if(!flag){
            return x >= 0 && x < N && y >=0 && y < N && normalVisited[y][x] == 0 && color == map[y][x];
        } else {
            if(color == 'R' || color == 'G'){
                return x >= 0 && x < N && y >=0 && y < N && weaknessVisited[y][x] == 0 && ('R' == map[y][x] || 'G' == map[y][x]);
            } else{
                return x >= 0 && x < N && y >=0 && y < N && weaknessVisited[y][x] == 0 && color == map[y][x];
            }
        }
    }
}
