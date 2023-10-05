import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int number = Integer.parseInt(bufferedReader.readLine().split(" ")[1]);

        String[] line = bufferedReader.readLine().split(" ");

        Arrays.stream(line).mapToInt(Integer::parseInt)
            .filter(num -> number > num)
            .forEach(n -> System.out.print(n + " "));
    }
}
