import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static List<List<Integer>> lines = new ArrayList<>();

    public static void main(String[] args) {

        int peakNum = scanner.nextInt();
        int lineNum = scanner.nextInt();
        boolean isVisited[] = new boolean[peakNum + 1];

        for(int i = 0; i <= peakNum; i++){
            lines.add(new ArrayList<>());
        }

        for(int i = 0; i < lineNum; i++){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();

            lines.get(num1).add(num2);
            lines.get(num2).add(num1);
        }

        int i = bfs(isVisited);

        System.out.println(i);
    }


    private static int bfs(boolean[] visited){
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = true;

        while(!queue.isEmpty()){
            int peak = queue.poll();

            for(int i = 0; i < lines.get(peak).size(); i++){
                int linkedPeak = lines.get(peak).get(i);

                if(!visited[linkedPeak]){
                    queue.add(lines.get(peak).get(i));
                    visited[lines.get(peak).get(i)] = true;
                }
            }
        }

        int count = 0;
        for(boolean result : visited){
            if(result){
                count++;
            }
        }

        return count-1;
    }
}
