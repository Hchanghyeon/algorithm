import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;

        String numString = Integer.toString(n);
        char[] numArr = numString.toCharArray();
        for(int i=0; i < numArr.length; i++){
            sum += numArr[i] - '0';
        }
        return sum;
    }
}