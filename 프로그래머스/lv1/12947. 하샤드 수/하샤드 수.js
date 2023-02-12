function solution(x) {
   
    const numberArr = x.toString().split('').map(Number);
    return x % numberArr.reduce((sum, num) => sum + num) === 0;
}