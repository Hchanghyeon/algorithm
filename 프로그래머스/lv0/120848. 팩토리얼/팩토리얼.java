class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 1;
        int i = 1;
        while(true){
            sum = sum * i;
            if(sum > n){
                return i-1;
            }
            i++;
        }
    }
}