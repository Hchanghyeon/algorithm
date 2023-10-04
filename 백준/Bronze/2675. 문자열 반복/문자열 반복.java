import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < count; i++){

            String[] line = bufferedReader.readLine().split(" ");

            int repeatCount = Integer.parseInt(line[0]);
            String[] chars = line[1].split("");
            for(int j = 0; j < chars.length; j++){
                System.out.print(chars[j].repeat(repeatCount));
            }
            System.out.println();
        }
    }
}
