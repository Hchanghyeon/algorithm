import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        while(true){
            String line = bufferedReader.readLine();

            if(line.equals("0")){
                break;
            }

            String reverseLine = new StringBuffer(line).reverse().toString();

            if(line.equals(reverseLine)){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
