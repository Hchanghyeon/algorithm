function solution(answers) {
    let one = [1,2,3,4,5];
    let two = [2,1,2,3,2,4,2,5];
    let three = [3,3,1,1,2,2,4,4,5,5];
    
    let oneNum = 0;
    let twoNum = 0;
    let threeNum = 0;
    
    let oneCount = 0;
    let twoCount = 0;
    let threeCount = 0;
    
    for(let i=0; i < answers.length; i++){
        if(i % one.length === 0) {
            oneNum = 0;
        }
        if(i % two.length === 0){
            twoNum = 0;
        }
        if(i % three.length === 0){
            threeNum = 0;
        }
        if(answers[i] === one[oneNum]){
            oneCount++;
        }
        if(answers[i] === two[twoNum]){
            twoCount++;
        }
        if(answers[i] === three[threeNum]){
            threeCount++;
        }
        oneNum++;
        twoNum++;
        threeNum++;
    }
    
    const result = [];

    const arr = [oneCount, twoCount, threeCount]
    const maxNum = Math.max(...arr);
    
    for(let i=0; i < 3; i++){
        if(maxNum === arr[i]){
            result.push(i+1);
        }
    }
    
    return result;
}