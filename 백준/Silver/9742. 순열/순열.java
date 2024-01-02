import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    private static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static String[] data;
    private static int point;
    private static String[] temp;
    private static boolean[] visited;
    private static int totalCount = 0;
    private static String str;
    private static String[] line;
    private static boolean flag;

    public static void main(String[] args) throws IOException {

        StringTokenizer st = new StringTokenizer(" ");


        while((str = bufferedReader.readLine())!=null) {
            totalCount = 0;
            flag = false;

            line =str.split(" ");
            data = line[0].split("");
            point = Integer.parseInt(line[1]);
            visited = new boolean[data.length];
            temp = new String[data.length];
            recursive(0);

            if (!flag) {
                System.out.print(line[0] + " " + line[1] + " = No permutation");
            }
            System.out.println();
        }
    }

    private static void recursive(final int count) {
        if(count == data.length){
            totalCount++;
            if(totalCount == point){
                flag = true;
                System.out.print(line[0] + " " + line[1] + " = ");

                for(String str: temp){
                    System.out.print(str);
                }
            }

            return;
        }

        for(int i = 0; i < data.length; i++){
            if(!visited[i]){
                visited[i] = true;
                temp[count] = data[i];
                recursive(count + 1);
                visited[i] = false;
            }
        }
    }
}
