import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int N = nums.length / 2;
        
        Set<Integer> set = new HashSet<>();
        
        for(int num : nums){
            set.add(num);
        }
        
        if(set.size() >= N){
            return N;   
        }
        
        return set.size();
    }
}