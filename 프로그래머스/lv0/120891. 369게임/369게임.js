function solution(order) {
    let answer = [];
    answer = order.toString().split('').filter(item => item === '3' || item === '6' || item ==='9');
    console.log(answer);
    return answer.length;
}