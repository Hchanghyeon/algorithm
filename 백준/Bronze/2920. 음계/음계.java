import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String[] line = bufferedReader.readLine().split(" ");
        String text = String.join("", line);

        if(text.equals("12345678")){
            System.out.println("ascending");
            return;
        }

        if(text.equals("87654321")){
            System.out.println("descending");
            return;
        }

        System.out.println("mixed");
    }
}
