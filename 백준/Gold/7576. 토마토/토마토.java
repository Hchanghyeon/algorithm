import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class Main {

	private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	private static int map[][];
	private static int visited[][];
	private static int mx[] = {0, 1, 0, -1};
	private static int my[] = {-1, 0, 1, 0};
	private static int width = 0;
	private static int height = 0;
	private static Deque<int[]> queue = new ArrayDeque();
	private static int count = 0;
	private static boolean flag;

	public static void main(String[] args) throws IOException {

		String[] size = bufferedReader.readLine().split(" ");
		width = Integer.parseInt(size[0]);
		height = Integer.parseInt(size[1]);

		map = new int[height][width];
		visited = new int[height][width];

		for(int i = 0; i < height; i++){
			String[] line = bufferedReader.readLine().split(" ");
			map[i] = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
		}

		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				if(map[i][j] == 1) {
					queue.add(new int[]{j, i});
					visited[i][j] = 1;
				}
			}
		}

		bfs();

		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				if(map[i][j] == -1){
					visited[i][j] = -1;
				}
				if(visited[i][j] == 0){
					flag = true;
					break;
				}
				list.add(visited[i][j]);
			}
		}

		if(flag){
			System.out.println(-1);
		} else {
			System.out.println(list.stream().mapToInt(v -> v).max().orElseThrow() - 1);
		}
	}

	private static void bfs() {

		while(!queue.isEmpty()){
			int[] point = queue.poll();

			for(int i = 0; i < 4; i++){
				int dx = mx[i] + point[0];
				int dy = my[i] + point[1];

				if(isBoundary(dx, dy)){
					queue.add(new int[]{dx, dy});
					visited[dy][dx] = visited[point[1]][point[0]] + 1;
				}
			}
		}

	}

	private static boolean isBoundary(int dx, int dy) {
		return dx < width && dx >= 0 && dy < height && dy >= 0 && visited[dy][dx] == 0  && map[dy][dx] == 0;
	}
}
