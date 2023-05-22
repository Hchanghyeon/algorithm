class Solution {
    public String solution(String n_str) {
        String answer = n_str;
        String[] n_strArr = n_str.split("");
        int count = 0;
        for(int i=0; i < n_strArr.length; i++){
            if(!n_strArr[i].equals("0")) break;
            count++;
        }
        if(count != 0){
            answer = String.join("",n_strArr).substring(count, n_strArr.length);
        }
        return answer;
    }
}