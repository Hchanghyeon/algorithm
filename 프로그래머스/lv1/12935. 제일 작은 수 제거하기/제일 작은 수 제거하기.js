function solution(arr) {
    const min = Math.min(...arr);
    const answer = arr.filter(item => {
        if(min !== item) return item;
    })
    
    if(answer.length===0) answer.push(-1);
    return answer;
}