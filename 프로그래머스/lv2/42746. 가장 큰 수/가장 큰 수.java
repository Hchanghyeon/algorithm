import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        
        String[] arr = Arrays.stream(numbers).mapToObj(String::valueOf).toArray(String[]::new);
        
        Arrays.sort(arr, (a,b) -> (b+a).compareTo(a+b));
        
        for(String item : arr){
            answer += item;
        }
        
        if(arr[0].equals("0")){
            return "0";
        }
        
        return answer;
    }
}