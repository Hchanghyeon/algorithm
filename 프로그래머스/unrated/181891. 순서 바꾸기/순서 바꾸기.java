import java.util.*;
import java.util.stream.Stream;
class Solution {
    public int[] solution(int[] num_list, int n) {      
        int[] answer = new int[num_list.length];
        int[] arr1 = Arrays.copyOfRange(num_list, 0, n);
        int[] arr2 = Arrays.copyOfRange(num_list, n, num_list.length);
        int count = 0;
        for(int num : arr2){
            answer[count] = num;
            count++;
        }
        
        for(int num : arr1){
            answer[count] = num;
            count++;
        }

        return answer;
    }
}