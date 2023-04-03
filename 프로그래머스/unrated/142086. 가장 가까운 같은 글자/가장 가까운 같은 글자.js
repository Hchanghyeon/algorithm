function solution(s) {
    let answer = [];
    let strArr = s.split('');
    let tempArr = [];
    
    for(let i=0; i < strArr.length; i++){
        if(tempArr.indexOf(strArr[i]) === -1) {
                answer.push(-1);
        }
        else {
            let tempIdx = 0;
            for(let j=0; j < tempArr.length; j++){
                if(strArr[i] === tempArr[j]) tempIdx = j;
            }
            answer.push(i - tempIdx);
        }
        tempArr.push(strArr[i]);
    }
    
    return answer;
}