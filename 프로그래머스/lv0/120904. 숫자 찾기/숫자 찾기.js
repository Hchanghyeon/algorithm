function solution(num, k) {
    let answer = -1;
    let stringNum = String(num).split('');
    for(let i=0; i < stringNum.length; i++){
        if(stringNum[i] === String(k)){
            answer = i+1;
            break;
        }
    }
    return answer;
}