import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());

        String[] arr = new String[count];

        for(int i = 0; i < count; i++){
            arr[i] = bufferedReader.readLine();
        }

        Arrays.stream(arr).distinct()
                .sorted((String s1, String s2) -> {
                    if(s1.length() == s2.length()){
                        return s1.compareTo(s2);
                    } else {
                        return s1.length() - s2.length();
                    }
                })
            .forEach(System.out::println);
    }
}
