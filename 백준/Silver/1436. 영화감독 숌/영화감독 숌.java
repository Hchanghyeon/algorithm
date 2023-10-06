import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {

        int result = Integer.parseInt(bufferedReader.readLine());
        int num = 0;
        int count = 0;


        while(true){
            num++;

            if(String.valueOf(num).contains("666")){
                count++;
            }

            if(count == result){
                System.out.println(num);
                break;
            }
        }
    }
}
