function solution(a, b, n) {
    let answer = 0;
    let remainder = 0;

    while(n >= a){
        remainder = n % a;
        answer += parseInt(n / a) * b;
        n = parseInt(n / a) * b + remainder;
    }
    
    return answer;
}