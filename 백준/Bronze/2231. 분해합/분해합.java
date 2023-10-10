import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int number = Integer.parseInt(bufferedReader.readLine());
        int result = 0;

        for(int i = 1; i <= 1000000; i++){
            String strNumber = String.valueOf(i);
            String[] strArr = strNumber.split("");
            int sum = Arrays.stream(strArr).mapToInt(Integer::parseInt).sum();

            if(i + sum == number){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
