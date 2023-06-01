import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> deleteList = Arrays.stream(delete_list).boxed().collect(Collectors.toList());

        List<Integer> answerList = arrList.stream().filter(item -> !deleteList.contains(item)).collect(Collectors.toList());
        
        answer = answerList.stream().mapToInt(Integer::valueOf).toArray();
        
        return answer;
    }
}