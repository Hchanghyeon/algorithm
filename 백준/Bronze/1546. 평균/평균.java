import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());
        String[] line = bufferedReader.readLine().split(" ");

        int[] arr = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
        int max = Arrays.stream(arr).max().orElseThrow();

        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += (double) arr[i] / max * 100;
        }

        System.out.println(sum / count);
    }
}
