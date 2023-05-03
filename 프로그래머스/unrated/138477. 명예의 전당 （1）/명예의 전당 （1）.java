import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int i=0; i < score.length; i++){
            arr.add(score[i]);
            if(arr.size() > k){
                Integer min = Collections.min(arr);
                arr.remove(min);
            } 
            answer[i] = Collections.min(arr);
        }
        
        
        return answer;
    }
}