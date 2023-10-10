import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int number = Integer.parseInt(bufferedReader.readLine());
        int num = 1;
        int count = 0;

        while(true){
            count++;
            if(number <= num) {
                System.out.println(count);
                break;
            }

            num = num + (count * 6);
        }
    }
}
