function solution(s) {
    let answer = s;
    let zeroSum = 0;
    let count = 0;
    
    while(answer.length > 1){
        let zero = 0;
        let noZero = 0;

        for(let value of answer){
            if(value === "0") zero++;
            else noZero++;
        }
        
        answer = noZero.toString(2);
        zeroSum += zero;
        count++;
    }
    
    return [count, zeroSum];
}