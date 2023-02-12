function solution(n) {
    let answer = 0;
    let array = [];
    array[0] = 0;
    array[1] = 0;
    for(let i = 2; i <= n; i++){
        array.push(i);
    }

    for(let i = 2; i <= n/2; i++){
        for(let j = i * 2 ; j<=n; j=j+i){
                array[j]=0;
        }
    }

    for(let i = 0; i <= n; i++){
        if(array[i]!=0){
            answer++;
        }
    }
    return answer;
}