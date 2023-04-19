class Solution {
    public String solution(String s) {
        String answer = "";
        String[] strArr = s.split(" ", -1);
        String[] tempArr = new String[strArr.length];
        
        for(int i=0; i < strArr.length; i++){
            String tempStr = "";
            for(int j=0; j < strArr[i].length(); j++){
                if(j % 2 == 0){
                    tempStr += Character.toUpperCase(strArr[i].charAt(j));
                } else {
                    tempStr += Character.toLowerCase(strArr[i].charAt(j));
                }
            }
            tempArr[i] = tempStr;
        }
        return String.join(" ", tempArr);
}
}