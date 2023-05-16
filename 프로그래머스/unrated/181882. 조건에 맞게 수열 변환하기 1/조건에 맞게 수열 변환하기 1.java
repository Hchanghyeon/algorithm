class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length];
        int count = 0;
        for(int item : arr){
            if(item >= 50 && item % 2 == 0) answer[count] = item / 2;
            else if(item < 50 && item % 2 == 1) answer[count] = item * 2;
            else answer[count] = item;
            count++;
        }
        return answer;
    }
}