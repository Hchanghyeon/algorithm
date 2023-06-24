import java.util.*;

class Solution {
    private final Deque<String> useWords = new ArrayDeque<>();
    private int[] answer = new int[2];
    
    public int[] solution(int n, String[] words) {
        for(int i=0; i < words.length; i++){
            if(checkUseWord(words[i]) || !checkCharacter(words[i])) {
                gameResult(i, n);
                break;
            }
            useWords.add(words[i]);
        }
        
        return answer;
    }
    
    private void gameResult(int index, int personnel){
        answer[0] = (index) % personnel + 1;
        answer[1] = (int)Math.ceil((double)(index + 1) / personnel);
    }
    
    private boolean checkUseWord(String word){
        return useWords.contains(word);
    }

    private boolean checkCharacter(String word){
        if(!useWords.isEmpty()){
            String lastString = useWords.peekLast();
            
            if(lastString.charAt(lastString.length()-1)!=(word.charAt(0))){         
                return false;
            }
        }
        
        return true;
    }
}