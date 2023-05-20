import java.util.*;

class Solution {
    public String solution(String myString) {
        String[] answer = new String[myString.length()];
        String[] arr = myString.split("");
        int count = 0;
        for(String str : arr){
            if(str.equals("a")){
                answer[count] = str.toUpperCase();
            } else if(!str.equals("A") && Character.isUpperCase(str.charAt(0))) {
                answer[count] = str.toLowerCase();
            } else {
                answer[count] = str;
            }
            count++;
        }
        
        return String.join("", answer);
    }
}