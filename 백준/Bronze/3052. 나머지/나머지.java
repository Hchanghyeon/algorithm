import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < 10; i++){
            set.add(Integer.parseInt(bufferedReader.readLine()) % 42);
        }

        System.out.println(set.size());
    }
}
