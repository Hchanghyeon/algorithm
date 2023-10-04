import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        boolean flag = true;

        while(flag){
            String[] line = bufferedReader.readLine().split(" ");

            int num1 = Integer.parseInt(line[0]);
            int num2 = Integer.parseInt(line[1]);

            if(num1 == 0 && num2 == 0){
                break;
            }

            System.out.println(Integer.parseInt(line[0]) + Integer.parseInt(line[1]));
        }

    }
}
