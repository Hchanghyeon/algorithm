function solution(n, numlist) {
    const answer = numlist.filter(item => {
        if(item % n === 0) return item;
    })
    
    return answer;
}