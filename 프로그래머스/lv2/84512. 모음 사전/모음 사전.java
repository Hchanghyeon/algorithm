import java.util.*;

class Solution {
    
    private static final char[] alpaArr = {'A','E','I','O','U'};
    private static final List<String> words = new ArrayList<>();
    
    public int solution(String word) {
        generateWords("");
        return words.indexOf(word);
    }
    
    public void generateWords(String word){
        words.add(word);
        
        if(word.length() == 5) return;
        
        for(char alpa : alpaArr){
            generateWords(word + alpa);
        }
    }
}