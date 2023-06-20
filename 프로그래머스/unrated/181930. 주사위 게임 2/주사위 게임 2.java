import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
        set.add(a);
        set.add(b);
        set.add(c);
        
        if(set.size() == 3){
            return a + b + c;
        }
        if(set.size() == 2){
            return (a + b + c) * (int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2));
        }
        if(set.size() == 1){
            return (a + b + c) * (int)(Math.pow(a, 2)+Math.pow(b, 2)+Math.pow(c, 2)) * (int)(Math.pow(a, 3)+Math.pow(b, 3)+Math.pow(c, 3));
        }
        
        return answer;
    }
}