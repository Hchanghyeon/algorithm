import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    static HashMap<Integer, Integer> map;
    public static void main(String args[]) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int k = Integer.parseInt(reader.readLine());
        String[] temp;
        int[][] arr = new int[n][n];
        for(int i = 0; i < k; i++){
            temp = reader.readLine().split(" ");
            arr[Integer.parseInt(temp[0])-1][Integer.parseInt(temp[1])-1] = 1;
        }
        int l = Integer.parseInt(reader.readLine());
        map = new HashMap<>();
        for(int i = 0; i < l; i++){
            temp = reader.readLine().split(" ");
            if(temp[1].equals("L"))
                map.put(Integer.parseInt(temp[0]), -1);
            else
                map.put(Integer.parseInt(temp[0]), 1);
        }

        int arrow = 0, cnt = 0;
        int[] dx = {0, 1, 0, -1};
        int[] dy = {1, 0, -1, 0};
        point head = new point(0, 0);
        LinkedList<point> body = new LinkedList<>();
        while(true){
            body.add(new point(head.x, head.y));
            head = new point(head.x+dx[arrow], head.y+dy[arrow]);
            if((head.x < 0 || head.x >= n ) || (head.y < 0 || head.y >= n)){
                cnt += 1;
                break;
            }
            else if(isbody(head, body)){
                cnt += 1;
                break;
            }
            else{
                if(arr[head.x][head.y] == 1){
                    arr[head.x][head.y] = 0;
                }
                else{
                    body.remove(0);
                }
                cnt += 1;
                arrow = arrowPosition(arrow, cnt);
            }
        }
        System.out.println(cnt);

    }
    public static boolean isbody(point head, LinkedList<point> body){
        for(int i = 0; i < body.size(); i++){
            if(body.get(i).x == head.x && body.get(i).y == head.y){
                return true;
            }
        }
        return false;
    }

    public static int arrowPosition(int arrow, int cnt){
        if(map.containsKey(cnt)){
            arrow = (arrow + map.get(cnt) + 4) % 4;
        }
        return arrow;
    }

    public static class point{
        int x, y;
        public point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}