import java.util.*;
class Solution {
    public int solution(int[] num_list) {
        int mul = Arrays.stream(num_list).reduce(1, (sum, pre) -> sum * pre);
        int sum = Arrays.stream(num_list).sum();
        
        if(sum * sum > mul){
            return 1;
        }
        return 0;
    }
}