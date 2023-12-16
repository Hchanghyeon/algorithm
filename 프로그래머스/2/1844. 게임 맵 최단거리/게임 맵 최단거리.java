import java.util.*;

class Solution {
    public int solution(int[][] maps) {
        int[] dx = {0, 1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        
        int width = maps[0].length;
        int height = maps.length;
        boolean visited[][] = new boolean[height][width];
        
        Deque<int[]> deque = new ArrayDeque<>();
        deque.add(new int[]{0, 0});
        visited[0][0] = true;
        
        while(!deque.isEmpty()){
            int[] next = deque.poll();
            
            for(int i = 0; i < 4; i++){
                int mx = next[1] + dx[i];
                int my = next[0] + dy[i];
                
                if(mx >= 0 && my >= 0 && mx < width && my < height && !visited[my][mx] && maps[my][mx] == 1){
                    if(mx == width - 1 && my == height - 1){
                        maps[my][mx] = maps[next[0]][next[1]] + 1;
                        deque.clear();
                        break;
                    }
                    
                    visited[my][mx] = true;
                    maps[my][mx] = maps[next[0]][next[1]] + 1;
                    deque.add(new int[]{my, mx});
                }
            }
        }
        
        if(maps[height-1][width-1] == 1){
            return -1;
        }
        
        return maps[height-1][width-1];
    }
}