import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while(true){
            String[] line = bufferedReader.readLine().split(" ");

            long count = Arrays.stream(line).mapToInt(Integer::parseInt)
                .filter(item -> item == 0)
                .count();

            if(count == 3L) break;

            int[] arr = Arrays.stream(line).mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

            if(arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2]){
                System.out.println("right");
            } else{
                System.out.println("wrong");
            }
        }
    }
}
