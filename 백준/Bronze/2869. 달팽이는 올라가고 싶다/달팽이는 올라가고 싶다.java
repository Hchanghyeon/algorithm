import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        String[] line = bufferedReader.readLine().split(" ");
        int A = Integer.parseInt(line[0]);
        int B = Integer.parseInt(line[1]);
        int V = Integer.parseInt(line[2]);

        int result = (int) Math.ceil((double)(V-B) / (double)(A-B));
        System.out.println(result);
    }
}
