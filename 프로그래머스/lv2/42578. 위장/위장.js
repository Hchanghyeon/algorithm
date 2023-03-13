function solution(clothes) {
    let answer = 1;
    let hashTable = {};
    
    for(let i=0; i < clothes.length; i++){
        if(hashTable[clothes[i][1]] === undefined){
            hashTable[clothes[i][1]] = [clothes[i][0]];
        } else {
            hashTable[clothes[i][1]] = [...hashTable[clothes[i][1]], clothes[i][0]];
        }
    }
    
    for(const key in hashTable){
        answer *= (hashTable[key].length + 1);
    }
    
    return answer - 1;
}