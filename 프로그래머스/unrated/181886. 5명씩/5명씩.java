import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        int num = (int)Math.ceil((double)names.length / 5);
        String[] answer = new String[num];
        int count = 0;
        for(int i=0; i < names.length; i++){
            if(i % 5 == 0) {answer[count] = names[i];
                           count++;}
            
        }
        return answer;
    }
}