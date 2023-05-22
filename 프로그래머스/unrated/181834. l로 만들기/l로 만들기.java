class Solution {
    public String solution(String myString) {
        String answer = "";
        String[] strArr = myString.split("");
        int inum = (int)"l".charAt(0);
        for(int i=0; i < strArr.length; i++){
            char ch = strArr[i].charAt(0);
            int ascii = (int)ch;
            if(inum > ascii) strArr[i] = "l";
        }
        
        return String.join("",strArr);
    }
}