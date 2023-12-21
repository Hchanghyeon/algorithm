import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(bufferedReader.readLine());
        int result = 0;

        for (int i = 1; i <= N; i *= 10) {
            result += (N - i + 1);
        }

        System.out.println(result);
    }
}
