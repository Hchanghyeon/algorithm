function solution(age) {
    let charArr = ['a','b','c','d','e','f','g','h','i','j'];
    let ageObj = {};
    for(let i=0; i < charArr.length; i++){
        ageObj[`${i}`] = charArr[i];
    }
    const ageArr = age.toString().split('');
    let answer = [];
    for(let i=0; i < ageArr.length; i++){
        answer.push(ageObj[ageArr[i]]);
    }
    return answer.join('');
}