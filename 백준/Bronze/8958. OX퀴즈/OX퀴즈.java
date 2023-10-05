import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < count; i++) {
            String[] line = bufferedReader.readLine().split("");
            int temp = 0;
            int sum = 0;

            for(int j = 0; j < line.length; j++){
                if(line[j].equals("O")){
                    temp += 1;
                } else {
                    if(temp == 0){
                        continue;
                    }
                    sum += tempSum(temp);
                    temp = 0;
                }
            }

            if(temp != 0){
                sum += tempSum(temp);
            }

            System.out.println(sum);
        }
    }

    private static int tempSum(int temp) {
        int sum = 0;
        for(int i=1; i <= temp; i++){
            sum += i;
        }

        return sum;
    }
}
