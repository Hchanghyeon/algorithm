import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        Map<String, Integer> nameScore = new HashMap<String,Integer>();
        
        for(int i = 0; i < name.length; i++){
            nameScore.put(name[i], yearning[i]);
        }
        
        for(int i = 0; i < photo.length; i++){
            int sum = 0;
            for(int j = 0; j < photo[i].length; j++){
                if(nameScore.get(photo[i][j]) != null){
                    sum += nameScore.get(photo[i][j]);
                }
            }
            answer[i] = sum;
        }
        
        
        return answer;
    }
}