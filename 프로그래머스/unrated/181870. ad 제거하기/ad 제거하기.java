import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        List<String> strList = Arrays.asList(strArr);
        
        answer = strList.stream()
            .filter(item -> !item.contains("ad"))
            .toArray(String[]::new);
        
        return answer;
    }
}