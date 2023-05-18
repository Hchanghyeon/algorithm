import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[Arrays.stream(arr).sum()];
        int count = 0;
        for(int i=0; i < arr.length; i++){
            for(int j=0; j < arr[i]; j++){
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }
}