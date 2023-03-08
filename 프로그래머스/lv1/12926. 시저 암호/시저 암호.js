function solution(s, n) {
    let answer = [];
    
    for(let i=0; i< s.length; i++){
        const charNum = s.charCodeAt(i);
        if(charNum === 32){
            answer.push(' ');
        }
        if(charNum > 96 && charNum < 123){
            if(charNum + n > 122){
                answer.push(String.fromCharCode(charNum + n - 122 + 96));
            }else {
                answer.push(String.fromCharCode(charNum + n));
            }
            
        } else if(charNum > 64 && charNum < 91){
            if(charNum + n > 90){
                answer.push(String.fromCharCode(charNum + n - 90 + 64));
            } else {
                answer.push(String.fromCharCode(charNum + n));
            }
            
        } 
    }
    
    return answer.join('');
}