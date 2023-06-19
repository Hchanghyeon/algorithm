import java.util.*;

class Solution {
    public int solution(String number) {
        int answer = 0;
        
        int sum = Arrays.stream(number.split("")).mapToInt(Integer::parseInt).sum();
        
        int something = sum % 9;
        
        return something;
    }
}