import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] arr = Arrays.stream(score).boxed().toArray(Integer[]::new);
        ArrayList<Integer> scoreArr = new ArrayList<Integer>(Arrays.asList(arr));
        
        Collections.sort(scoreArr, Collections.reverseOrder());
        
        ArrayList<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i < scoreArr.size(); i++){
            temp.add(scoreArr.get(i));
            if(temp.size() == m) {
                answer += Collections.min(temp) * m;
                temp.clear();
            }

        }
        
        
        return answer;
    }
}