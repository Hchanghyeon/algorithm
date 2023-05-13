class Solution {
    public int solution(int[] num_list) {
        int count = 0;
        for(int item : num_list){
            if(item < 0) return count;
            count++;
        }
        return -1;
    }
}