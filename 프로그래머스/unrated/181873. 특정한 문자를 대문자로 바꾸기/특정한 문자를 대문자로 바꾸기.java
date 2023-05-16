import java.util.*;

class Solution {
    public String solution(String my_string, String alp) {
        String[] stringArr = my_string.split("");
        for(int i=0; i < stringArr.length; i++){
            if(stringArr[i].equals(alp)) stringArr[i] = alp.toUpperCase();
        }
        return String.join("",stringArr);
    }
}