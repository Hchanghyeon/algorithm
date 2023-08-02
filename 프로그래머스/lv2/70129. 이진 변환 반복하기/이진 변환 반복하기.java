import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int count = 0;
        int removedZero = 0;
        
        while(s.length() > 1){
            int beforeRemoveZero = s.length();
            s = s.replaceAll("0","");
            int afterRemoveZero = s.length();
            s = Integer.toBinaryString(s.length());
            count++;
            removedZero += beforeRemoveZero - afterRemoveZero;
        }
        
        answer[0] = count;
        answer[1] = removedZero;
        
        return answer;
    }
}