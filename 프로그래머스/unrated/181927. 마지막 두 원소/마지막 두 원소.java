class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length+1];
        int last = num_list[num_list.length-1];
        int lastPre = num_list[num_list.length-2];
        int num = 0;
        if(last > lastPre) num = last - lastPre;
        else num = last * 2;
        
        for(int i=0; i < answer.length; i++){
            if(i != answer.length-1) answer[i] = num_list[i];
            else answer[i] = num;
        }
        
        
        return answer;
    }
}