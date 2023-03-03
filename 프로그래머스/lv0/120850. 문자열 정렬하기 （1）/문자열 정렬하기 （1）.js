function solution(my_string) {
    const regex = /[^0-9]/g;
    let answer = my_string.replace(regex,"");
    
    return answer.split('').sort().map(Number);
}