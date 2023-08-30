import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.stream.Collectors;

public class Main {

	private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	private static final int[] mx = {0, 1, 1, 1, 0, -1, -1, -1};
	private static final int[] my = {-1, -1, 0, 1, 1, 1, 0, -1};
	private static int width = 0;
	private static int height = 0;
	private static int[][] visited;
	private static int[][] map;
	private static int max = 0;

	public static void main(String[] args) throws IOException {
		String[] input = bufferedReader.readLine().split(" ");

		height = Integer.parseInt(input[0]);
		width = Integer.parseInt(input[1]);

		map = new int[height][width];

		for(int i = 0; i < height; i++){
			String[] line = bufferedReader.readLine().split(" ");
			map[i] = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
		}

		for(int i = 0; i < height; i++){
			for(int j = 0; j < width; j++){
				visited = new int[height][width];
				if(map[i][j] == 0){
					bfs(i, j);
				}
			}
		}

		System.out.println(max);
	}

	private static void bfs(int y, int x) {
		Deque<int[]> queue = new ArrayDeque<>();
		queue.add(new int[]{x, y});

		while(!queue.isEmpty()){
			int[] point = queue.poll();

			for(int i = 0; i < 8; i++){
				int dx = mx[i] + point[0];
				int dy = my[i] + point[1];

				if(isBoundary(dx, dy)){
					if(map[dy][dx] == 1){
						if(visited[point[1]][point[0]] + 1 > max){
							max = visited[point[1]][point[0]] + 1;
						}
						return;
					}

					queue.add(new int[]{dx,dy});
					visited[dy][dx] = visited[point[1]][point[0]] + 1;
				}
			}
		}
	}

	private static boolean isBoundary(int dx, int dy) {
		return dx < width && dx >= 0 && dy < height && dy >= 0 && visited[dy][dx] == 0;
	}
}