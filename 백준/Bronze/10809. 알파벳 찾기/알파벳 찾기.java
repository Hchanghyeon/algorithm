import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int min = "a".charAt(0);
        int max = "z".charAt(0);

        String[] strings = bufferedReader.readLine().split("");

        for(int i = min; i <= max; i++){
            boolean flag = false;
            for(int j = 0; j < strings.length; j++){
                if(i == strings[j].charAt(0)){
                    System.out.print(j + " ");
                    flag = true;
                    break;
                }
            }

            if(!flag){
                System.out.print("-1 ");
            }

        }
    }

}
