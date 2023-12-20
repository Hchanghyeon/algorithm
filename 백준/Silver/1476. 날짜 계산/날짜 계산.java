import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static int earthRange = 15;
    private static int sunRange = 28;
    private static int moonRange = 19;

    public static void main(String[] args) throws IOException {
        int[] line = Arrays.stream(bufferedReader.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int year = 1;

        while (true) {
            int earth = year % earthRange == 0 ? earthRange : year % earthRange;
            int sun = year % sunRange == 0 ? sunRange : year % sunRange;
            int moon = year % moonRange == 0 ? moonRange : year % moonRange;

            if (earth == line[0] && sun == line[1] && moon == line[2]) {
                break;
            }

            year++;
        }

        System.out.println(year);
    }
}
