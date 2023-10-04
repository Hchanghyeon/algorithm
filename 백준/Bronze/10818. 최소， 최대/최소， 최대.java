import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int max = 1000001;
        int min = -1000001;

        int count = Integer.parseInt(bufferedReader.readLine());
        String[] line = bufferedReader.readLine().split(" ");

        for(int i = 0; i < count; i++){

            int num = Integer.parseInt(line[i]);

            if(num > min){
                min = num;
            }
            if(num < max){
                max = num;
            }
        }

        System.out.println(max + " " + min);
    }
}