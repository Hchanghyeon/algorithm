import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = Integer.parseInt(bufferedReader.readLine());
        int[] flags = new int[count];

        for(int i = 0; i < count; i++){
            Integer[][] map = new Integer[9][9];
            boolean flag = false;

            for(int j = 0; j < 9; j++){
                String[] line = bufferedReader.readLine().split(" ");
                map[j] = Arrays.stream(line).map(Integer::parseInt).toArray(Integer[]::new);
            }

            if(i != count - 1){
                bufferedReader.readLine();
            }

            for(int j = 0; j < 9; j++){
                Set<Integer> set = new HashSet<>(Arrays.asList(map[j]));

                if(set.size() != 9){
                    flag = true;
                    break;
                }
            }

            for(int j = 0; j < 9; j++){
                Set<Integer> set = new HashSet<>();

                for(int k = 0; k < 9; k++){
                    set.add(map[k][j]);
                }

                if(set.size() != 9){
                    flag = true;
                    break;
                }
            }

            for(int a = 0; a < 9; a+=3){
                for(int b = 0; b < 9; b+=3){
                    Set<Integer> set = new HashSet<>();
                    for(int c = a; c < a+3; c++){
                        for(int d = b; d < b+3; d++){
                            set.add(map[c][d]);
                        }
                    }
                    if(set.size() != 9){
                        flag = true;
                        break;
                    }
                }
            }

            if(flag){
                flags[i] = 1;
            }
        }

        for(int i = 0; i < flags.length; i++){
            System.out.print("Case " + (i+1) + ": ");
            if(flags[i]==1) System.out.println("INCORRECT");
            else System.out.println("CORRECT");
        }
    }
}
