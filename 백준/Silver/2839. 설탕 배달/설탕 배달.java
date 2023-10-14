import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int sugar = Integer.parseInt(bufferedReader.readLine());

        int count = 0;
        while(sugar > 0) {
            if(sugar % 5 == 0) {
                count += sugar / 5;
                System.out.println(count);
                return ;
            }
            if(sugar < 3) {
                System.out.println(-1);
                return ;
            }
            sugar-=3;
            count++;
        }

        System.out.println(count);
    }
}
