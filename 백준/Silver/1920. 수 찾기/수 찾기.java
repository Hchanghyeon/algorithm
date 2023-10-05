import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int num = Integer.parseInt(bufferedReader.readLine());

        int[] numbers = Arrays.stream(bufferedReader.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .sorted()
            .toArray();

        int count = Integer.parseInt(bufferedReader.readLine());

        int[] M = Arrays.stream(bufferedReader.readLine().split(" "))
            .mapToInt(Integer::parseInt)
            .toArray();

        for(int i = 0; i < count; i++){
            int first = 0;
            int last = num-1;
            int mid = 0;
            boolean flag = false;

            while(first <= last){

                mid = (last + first) / 2;

                if(M[i] == numbers[mid]){
                    flag = true;
                    break;
                }

                if(M[i] > numbers[mid]){
                    first = mid + 1;
                } else {
                    last = mid - 1;
                }
            }

            if(flag){
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
