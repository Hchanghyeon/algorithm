import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < count; i++) {
            int[] numbers = Arrays.stream(bufferedReader.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();

            int M = numbers[0];
            int N = numbers[1];
            int resultX = numbers[2];
            int resultY = numbers[3];

            int max = 0;
            int j = 0;

            while (true) {
                j++;
                if ((M * j) % N == 0) {
                    max = M * j;
                    break;
                }
            }

            int year = resultX;

            while (true) {
                if (year > max) {
                    System.out.println(-1);
                    break;
                }

                if (((year % N) == 0 ? N : year % N) == resultY) {
                    System.out.println(year);
                    break;
                }
                year += M;
            }
        }
    }
}
