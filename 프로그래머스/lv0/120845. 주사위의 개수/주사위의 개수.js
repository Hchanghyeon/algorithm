function solution(box, n) {
    let answer = 0;
    
    answer = box.map(item => {
        return Math.floor(item / n);
    }).reduce((sum, item) => (sum * item))
    
    return answer;
}