import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length-n+1];
        int count = 0;
        for(int i=0; i < num_list.length; i++){
            if(i+1 >= n) {
                answer[count] = num_list[i];
                count++;
            }
        }
        
        return answer;
    }
}