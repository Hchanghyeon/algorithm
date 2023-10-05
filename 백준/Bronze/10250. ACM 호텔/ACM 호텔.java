import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < count; i++){
            String[] line = bufferedReader.readLine().split(" ");
            int[] numLine = Arrays.stream(line).mapToInt(Integer::parseInt).toArray();
            int customer = numLine[2];
            int sum = 0;

            for(int h = 1; h <= numLine[1]; h++){
                for(int w = 1; w <= numLine[0]; w++){
                    sum++;

                    if(sum == customer){
                        System.out.print(w);
                        if(h < 10){
                            System.out.println("0"+h);
                        } else {
                            System.out.println(h);
                        }
                    }
                }
            }
        }

    }
}
