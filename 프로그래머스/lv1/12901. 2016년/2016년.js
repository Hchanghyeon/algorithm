function solution(a, b) {
    let answer = '';
    let day = ['THU', 'FRI', 'SAT', 'SUN', 'MON', 'TUE', 'WED', ];
    let month = [31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];
    let sum = 0;
    
    for(let i = 0; i < a-1; i++) {
          sum += month[i];  
    }
    sum += b;
    let num = sum % 7;
    answer = day[num];
    
    
    return answer;
}