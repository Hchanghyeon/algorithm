class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        String answerStr = "";
        for(String str : my_string.split(" ")){
            if(!str.equals("")){
                answerStr += str + " ";
            }
        }
       
        return answerStr.split(" ");
    }
}