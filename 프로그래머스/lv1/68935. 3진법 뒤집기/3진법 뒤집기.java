import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> t = new ArrayList<>();
        String three = "";
        
        while(n > 0){
            int j=0;
            int sum;
            sum = n % 3;
            t.add(sum);
            n = n / 3;
            j++;
        }
        
        // [0, 0, 2, 1];
        //  0  1  2  3
        Collections.reverse(t);
        
        for(int i = 0; i < t.size() ; i++){
            answer += (t.get(i) * (int)Math.pow(3, i));
        }
        
        return answer;
    }
}