function solution(s) {
    if((s.length === 4 || s.length === 6) && (!Number.isNaN(Number(s)) && !s.includes('e'))){
        return true;
    } else {
            return false;   
    }
}