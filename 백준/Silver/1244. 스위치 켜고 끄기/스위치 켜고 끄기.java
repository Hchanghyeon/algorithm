import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    private static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    private static boolean[] switchArr;
    private static StringBuilder stringBuilder = new StringBuilder();

    public static void main(String[] args) throws IOException {

        int switchCount = Integer.parseInt(bufferedReader.readLine());
        String[] switchArrString = bufferedReader.readLine().split(" ");
        switchArr = new boolean[switchCount];

        for(int i = 0; i < switchArrString.length; i++){
            if(switchArrString[i].equals("1")){
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
                for(int j = studentNumber; j <= switchCount; j+=studentNumber){
                    switchArr[j-1] = !switchArr[j-1];
                }
            }

            // 여학생일 경우
            if(studentGender == 2){
                switchArr[studentNumber - 1] = !switchArr[studentNumber - 1];
                int min = 1;
                int max = switchCount;

                int before = studentNumber - 1;
                int after = studentNumber + 1;

                while (min <= before && after <= max){
                    if(switchArr[before-1] != switchArr[after-1]){
                        break;
                    }

                    switchArr[before - 1] = !switchArr[before - 1];
                    switchArr[after - 1] = !switchArr[after - 1];

                    before -= 1;
                    after += 1;
                }

            }
        }


        for (int i = 0; i < switchCount; i++) {
            stringBuilder.append(switchArr[i] ? "1" : "0");

            if ((i + 1) % 20 == 0) {
                stringBuilder.append("\n");
            } else {
                    stringBuilder.append(" ");
            }
        }

        System.out.println(stringBuilder);
    }
}
