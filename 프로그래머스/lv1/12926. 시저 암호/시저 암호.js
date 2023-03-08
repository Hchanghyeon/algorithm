function solution(s, n) {
    let answer = [];
    
    for(let i=0; i< s.length; i++){
        // 문자열 각 자리 문자를 아스키코드로 변환
        const charNum = s.charCodeAt(i);
        // 변환된 코드가 공백 즉 32일 경우 answer 배열에 넣기
        if(charNum === 32){
            answer.push(' ');
        }
        // 만약 아스키코드로 변환한 문자가 a ~ z까지에 포함될 때
        if(charNum > 96 && charNum < 123){
            // 아스키코드에 n만큼 밀었을 때 z를 넘어가면 다시 a부터 더할 수 있도록 함
            if(charNum + n > 122){
                answer.push(String.fromCharCode(charNum + n - 122 + 96));
            }else {
                answer.push(String.fromCharCode(charNum + n));
            }
        // 만약 아스키코드로 변환한 문자가 A ~ Z까지에 포함 될 때
        } else if(charNum > 64 && charNum < 91){
            // 아스키코드에 n만큼 밀었을 때 Z를 넘어가면 다시 A부터 더할 수 있도록 함
            if(charNum + n > 90){
                answer.push(String.fromCharCode(charNum + n - 90 + 64));
            } else {
                answer.push(String.fromCharCode(charNum + n));
            }
        } 
    }
    // 모든 문자가 추가된 배열에 join으로 문자열로 합쳐주기
    return answer.join('');
}