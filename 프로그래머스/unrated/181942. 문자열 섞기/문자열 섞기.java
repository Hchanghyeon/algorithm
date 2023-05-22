class Solution {
    public String solution(String str1, String str2) {
        StringBuilder answer = new StringBuilder();
        String[] str1Arr = str1.split("");
        String[] str2Arr = str2.split("");
        for(int i=0; i < str1Arr.length; i++){
            answer.append(str1Arr[i]);
            answer.append(str2Arr[i]);
        }
        return answer.toString();
    }
}