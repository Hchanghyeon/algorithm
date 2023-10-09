import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());

        int[] arr = Arrays.stream(bufferedReader.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            int temp = 0 ;

            for(int j = 1; j <= arr[i]; j++){
                if(arr[i] % j == 0){
                    temp++;
                }
            }

            if(temp == 2) sum++;
        }

        System.out.println(sum);
    }
}
