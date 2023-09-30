import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 1; i <= count; i++){
            System.out.println("*".repeat(i));
        }
    }
}
