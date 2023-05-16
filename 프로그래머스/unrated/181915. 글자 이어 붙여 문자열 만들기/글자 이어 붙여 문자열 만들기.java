class Solution {
    public String solution(String my_string, int[] index_list) {
        String[] split_string = my_string.split("");
        StringBuilder answer = new StringBuilder();
        for(int index : index_list){
           answer.append(split_string[index]);
        }
        
        return answer.toString();
    }
}