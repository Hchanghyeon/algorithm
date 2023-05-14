import java.util.*;

class Solution {
    public int solution(String num_str) {
        int answer = 0;
        answer = Arrays.stream(num_str.split("")).mapToInt(Integer::parseInt).sum();
        
        return answer;
    }
}