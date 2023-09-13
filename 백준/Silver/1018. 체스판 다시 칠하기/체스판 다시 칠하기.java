import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static String[][] map;
    private static int width;
    private static int height;
    private static List<Integer> list = new ArrayList<>();
    private static int count;
    private static final Map<String, String> colorSwitch = Map.of("W", "B", "B", "W");



    public static void main(String[] args) throws IOException {
        String[] size = bufferedReader.readLine().split(" ");

        width = Integer.parseInt(size[1]);
        height = Integer.parseInt(size[0]);

        map = new String[height][width];

        for (int y = 0; y < height; y++) {
            map[y] = bufferedReader.readLine().split("");
        }

        for (int y = 0; y <= height - 8; y++) {
            for (int x = 0; x <= width - 8; x++) {
                paint(x, y);
            }
        }

        System.out.println(Collections.min(list));
    }

    private static void paint(int x, int y) {
        String WB = map[y][x];
        count = 0;

        for (int i = y; i < y + 8; i++) {
            for (int j = x; j < x + 8; j++) {
                if (!map[i][j].equals(WB)) {
                    count += 1;
                }
                if (WB.equals("W")) {
                    WB = "B";
                } else {
                    WB = "W";
                }
            }
            if (WB.equals("W")) {
                WB = "B";
            } else {
                WB = "W";
            }
        }

        list.add(Math.min(count, 64- count));
    }
}
