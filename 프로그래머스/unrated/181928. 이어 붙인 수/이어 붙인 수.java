class Solution {
    public int solution(int[] num_list) {
        String evenString = "";
        String oddString = "";
        
        for(int item : num_list){
            if(item % 2 == 0){
                evenString += String.valueOf(item);
            } else {
                oddString += String.valueOf(item);
            }
        }
        
        return Integer.parseInt(evenString) + Integer.parseInt(oddString);
    }
}