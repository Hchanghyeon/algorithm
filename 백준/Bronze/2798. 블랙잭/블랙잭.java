import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int[] line = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] numbers = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).sorted().toArray();

        int count = line[0];
        int max = 300000;
        int result = 0;

        for(int i = 0; i < count; i++){
            for(int j = i + 1; j < count; j++){
                for(int k = j + 1; k < count ; k++){
                    int cal = line[1] - (numbers[i] + numbers[j] + numbers[k]);
                    if(cal <= max && cal >= 0){
                        max = cal;
                        result = numbers[i] + numbers[j] + numbers[k];
                    }
                }
            }
        }
        System.out.println(result);
    }
}
