import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        String[] left = {"1","4","7","*"};
        String[] right = {"3","6","9","#"};
        String[] middle = {"2","5","8","0"};
        int lflag = 0;
        int rflag = 0;
        
        int l = 3;
        int r = 3;
        int m = 0;
    
        ArrayList<String> numberList = new ArrayList<String>();
        
        for(int i = 0; i < numbers.length; i++){
            numberList.add(Integer.toString(numbers[i]));
        }
        
        for(String number : numberList){
            for(int i = 0; i < left.length; i++){
                if(number.equals(left[i])){
                    answer += "L";
                    l = i;
                    lflag = 0;
                }
            }
            for(int i = 0; i < right.length; i++){
                if(number.equals(right[i])){
                    answer += "R";
                    r = i;
                    rflag = 0;
                }
            }
            for(int i = 0; i < middle.length; i++){
                if(number.equals(middle[i])){
                    m = i;
                    
                    int result1 = Math.abs(m - l)+1;
                    int result2 = Math.abs(m - r)+1;
                    
                    if((rflag==2)&&(lflag==1)){
                        result1 = Math.abs(m - l);
                        result2 = Math.abs(m - r);
                    } else if(rflag==2){
                        result2 = Math.abs(m - r);
                    } else if(lflag==1){
                        result1 = Math.abs(m - l);
                    }
                
                    if(result1 == result2){
                        m = i;
                        if(hand.equals("left")){
                            answer += "L";
                            l = i;
                            lflag=1;
                            
                        }else {
                            answer += "R";
                            r = i;
                            rflag=2;   
                        }
                    } else if(result1 < result2){
                        answer += "L";
                        l = i;
                        lflag=1;
                    } else if(result1 > result2) {
                        answer += "R";
                        r = i;
                        rflag=2;
                    }
                }
            }
        }
        return answer;
    }
}