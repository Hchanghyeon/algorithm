import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());

        String[] numbers = bufferedReader.readLine().split("");

        int sum = Arrays.stream(numbers).mapToInt(Integer::parseInt)
            .sum();

        System.out.println(sum);
    }
}
