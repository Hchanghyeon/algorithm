class Solution {
    public int solution(int n) {
        int num = n;
        int numBinary= 0;
        int nBinaryCount = Integer.bitCount(n); 
        int numBinaryCount = 0;
        while(true){
            num++;
            numBinaryCount = Integer.bitCount(num); 
            if(nBinaryCount == numBinaryCount) break;
        }
        
        return num;
    }
}