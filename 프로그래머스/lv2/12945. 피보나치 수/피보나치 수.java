class Solution {
    public int solution(int n) {
        int answer = 0;
        int nMinus1 = 1;
        int nMinus2 = 0;
        for(int i=2; i <= n; i++){
            answer = nMinus1 + nMinus2;
            nMinus2 = nMinus1 % 1234567;
            nMinus1 = answer % 1234567;
        }
        return answer % 1234567;
    }
}