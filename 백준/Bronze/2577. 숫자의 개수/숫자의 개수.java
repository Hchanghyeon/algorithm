import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int sum = 1;
        int[] numbers = new int[10];

        for(int i = 0; i < 3; i++){
            sum *= Integer.parseInt(bufferedReader.readLine());
        }

        String[] numbersArr = String.valueOf(sum).split("");

        for(int i = 0; i < numbersArr.length; i++){
            int num = Integer.parseInt(numbersArr[i]);
            numbers[num]++;
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
