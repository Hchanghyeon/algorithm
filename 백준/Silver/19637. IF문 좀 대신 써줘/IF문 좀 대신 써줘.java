import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        String line = bufferedReader.readLine();
        StringTokenizer stk = new StringTokenizer(line);
        int N = Integer.parseInt(stk.nextToken());
        int M = Integer.parseInt(stk.nextToken());

        int[] arr = new int[N];
        String[] titleArr = new String[N];

        for(int i = 0; i < N; i++){
            String game = bufferedReader.readLine();
            StringTokenizer stkGame = new StringTokenizer(game);
            String title = stkGame.nextToken();
            int power = Integer.parseInt(stkGame.nextToken());

            arr[i] = power;
            titleArr[i] = title;
        }

        for(int i = 0; i < M; i++) {
            int num = Integer.parseInt(bufferedReader.readLine());
            int first = 0;
            int last = N;

            int mid = 0;
            int result = 0;

            while(first <= last){
                mid = (first + last) / 2;

                if(arr[mid] >= num){
                    last = mid - 1;
                    result = mid;
                } else {
                    first = mid + 1;
                }
            }

            stringBuilder.append(titleArr[result]).append("\n");
        }

        System.out.println(stringBuilder);
    }
}
