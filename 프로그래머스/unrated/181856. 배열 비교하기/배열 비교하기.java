import java.util.*;

class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        int sum1 = 0;
        int sum2 = 0;
        if(arr1.length > arr2.length) answer = 1;
        else if(arr2.length > arr1.length) answer = -1;
        else {
            sum1 = Arrays.stream(arr1).sum();
            sum2 = Arrays.stream(arr2).sum();
            if(sum1 > sum2) answer = 1;
            else if(sum2 > sum1) answer = -1;
            else answer = 0;
        }
        return answer;
    }
}