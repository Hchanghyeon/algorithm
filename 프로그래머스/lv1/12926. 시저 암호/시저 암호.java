/* 
   1. 문자열 split
   2. split된 문자열을 순회하며 문자를 ASCII코드로 변환
   3. 소문자인지, 대문자인지 판별해서 그에 맞는 ASCII 코드 범위인지 확인
   4. 각 범위에서 문자에 n만큼 더해주고 이 값이 범위를 벗어나는 경우 벗어나는 만큼 MIN값에 더해주기
   5. 최종 값 answer에 더해주기
*/

class Solution {
    private String answer = "";
    private final int ASCII_UPPERCASE_MIN = 65;
    private final int ASCII_UPPERCASE_MAX = 90;
    private final int ASCII_LOWERCASE_MIN = 97;
    private final int ASCII_LOWERCASE_MAX = 122;
    private final int ASCII_SPACE = 32;
    
    public String solution(String s, int n) {
 
        for(String str : s.split("")){
            int strCode = (int)str.charAt(0);
            
            if(strCode == 32){
                answer += " ";
                continue;
            }
            
            if(ASCII_UPPERCASE_MIN <= strCode && strCode <= ASCII_UPPERCASE_MAX){
                int afterSumStrCode = strCode += n;
                
                if(afterSumStrCode > ASCII_UPPERCASE_MAX){
                    int sumValue = (afterSumStrCode - ASCII_UPPERCASE_MAX) % 26;
                    afterSumStrCode = ASCII_UPPERCASE_MIN + sumValue - 1; 
                }
                
                answer += (char)afterSumStrCode;
                continue;
            }
            
            if(ASCII_LOWERCASE_MIN <= strCode && strCode <= ASCII_LOWERCASE_MAX){
                int afterSumStrCode = strCode += n;
                
                if(afterSumStrCode > ASCII_LOWERCASE_MAX){
                    int sumValue = (afterSumStrCode - ASCII_LOWERCASE_MAX) % 26;
                    afterSumStrCode = ASCII_LOWERCASE_MIN + sumValue - 1; 
                }
                
                answer += (char)afterSumStrCode;
            }      
        }   
        return answer;
    }
}