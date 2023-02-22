function solution(s) {
    const arr = s.split(' ');
    const answer = [];
    for(let i = 0; i < arr.length; i++){
        const tempArr = [];
        for(let j = 0; j < arr[i].length; j++){
            const character = arr[i].charAt(j)
            if(j % 2 === 0){
                tempArr.push(character.toUpperCase());
            } else {
                tempArr.push(character.toLowerCase());
            }
        }
        answer.push(tempArr.join(''));
    }

    return answer.join(' ');
}