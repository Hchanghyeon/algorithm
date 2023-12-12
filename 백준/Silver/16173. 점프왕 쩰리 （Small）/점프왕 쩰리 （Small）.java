import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        final int lineCount = Integer.parseInt(bufferedReader.readLine());
        final int[][] map = new int[lineCount][lineCount];
        boolean[][] visited = new boolean[lineCount][lineCount];
        String result = "Hing";

        for (int i = 0; i < lineCount; i++) {
            int[] line = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            map[i] = line;
        }

        final Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[] {0, 0});

        while (!deque.isEmpty()) {
            int[] next = deque.poll();
            int move = map[next[0]][next[1]];
            visited[next[0]][next[1]] = true;
            int[] dx = {0, move};
            int[] dy = {move, 0};

            for (int i = 0; i < 2; i++) {
                int mx = next[0] + dx[i];
                int my = next[1] + dy[i];

                if (mx >= 0 && my >= 0 && mx < lineCount && my < lineCount && !visited[mx][my]) {
                    if (map[mx][my] == -1) {
                        result = "HaruHaru";
                        deque.clear();
                        break;
                    }

                    deque.add(new int[] {mx, my});
                }
            }
        }

        System.out.println(result);
    }
}
