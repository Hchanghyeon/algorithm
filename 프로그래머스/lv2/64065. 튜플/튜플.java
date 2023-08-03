import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        String[] arr = s.replaceAll("\\{", "").replaceAll("\\}","").split(",");
        int[] intArr = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        
        for (int n : intArr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<Integer> result = new ArrayList<>(map.keySet());
        Collections.sort(result, (a, b) -> map.get(b).compareTo(map.get(a)));
        answer = result.stream().mapToInt(Integer::intValue).toArray();

        
        return answer;
    }
}