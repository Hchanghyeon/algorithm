import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean[] switchArr;
    public static void main(String[] args) throws IOException {

        int switchCount = Integer.parseInt(bufferedReader.readLine());
        String[] switchArrString = bufferedReader.readLine().split(" ");
        switchArr = new boolean[switchCount + 1];

        for(int i = 1; i <= switchCount; i++){
            if(switchArrString[i-1].equals("1")){
                switchArr[i] = true;
            }
        }

        int studentCount = Integer.parseInt(bufferedReader.readLine());

        for(int i = 0; i < studentCount; i++){
            String[] line = bufferedReader.readLine().split(" ");
            int studentGender = Integer.parseInt(line[0]);
            int studentNumber = Integer.parseInt(line[1]);

            // 남학생일 경우
            if(studentGender == 1){
                for(int j = studentNumber; j <= switchCount; j += studentNumber){
                    switchArr[j] = !switchArr[j];
                }
            }

            // 여학생일 경우
            if(studentGender == 2){
                switchArr[studentNumber] = !switchArr[studentNumber];
                
                int before = studentNumber - 1;
                int after = studentNumber + 1;

                while (1 <= before && after <= switchCount){
                    if(switchArr[before] != switchArr[after]){
                        break;
                    }

                    switchArr[before] = !switchArr[before];
                    switchArr[after] = !switchArr[after];

                    before -= 1;
                    after += 1;
                }
            }
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= switchCount; i++) {
            stringBuilder.append(switchArr[i] ? "1" : "0");

            if (i % 20 == 0) {
                stringBuilder.append("\n");
            } else {
                stringBuilder.append(" ");
            }
        }

        System.out.println(stringBuilder);
    }
}
