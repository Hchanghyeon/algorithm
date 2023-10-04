import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int max = -1;
        int index = 0;

        for(int i = 0; i < 9; i++){
            int line = Integer.parseInt(bufferedReader.readLine());
            if(max < line){
                max = line;
                index = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(index);
    }
}
