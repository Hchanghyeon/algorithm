class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[n];
        int count = 0;
        for(int i=0; i < n; i++){
            answer[count] = num_list[i];
            count++;
        }
        
        return answer;
    }
}