function solution(my_string) {
    let answer = [];
    const set = new Set(my_string.split(''));
    answer = [...set];
    
    return answer.join('');
}