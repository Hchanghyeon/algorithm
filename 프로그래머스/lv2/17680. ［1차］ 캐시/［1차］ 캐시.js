function solution(cacheSize, cities) {
    let answer = 0;
    let cache = [];
    let flag = 0;
    if(cacheSize === 0){
        answer = cities.length * 5;
    }
    else{
    for(let i=0; i < cities.length; i++){
        for(let j=0; j < cache.length; j++){
            if(cache[j].toUpperCase() === cities[i].toUpperCase()){
                answer++;
                cache.splice(j,1);
                cache.push(cities[i]);
                flag = 1;
                break;
            }
        }
        if(flag === 1) {
            flag = 0;
            continue;
        };
        if(cache.length < cacheSize){
            answer +=5;
            cache.push(cities[i]);
        } else {
            answer +=5;
            cache.shift();
            cache.push(cities[i]);
        }
    }
        }
    return answer;
}