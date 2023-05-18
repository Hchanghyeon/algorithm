class Solution {
    public int solution(String myString, String pat) {
        String answer = "";
        String temp = "";
        String[] arr = myString.split("");
        for(int i=0; i < arr.length; i++){
            temp = arr[i];
            if(temp.equals("A")) answer += "B";
            else answer += "A";
        }
        
        return answer.contains(pat) ? 1 : 0;
    }
}