function solution(hp) {
    let num = 0;
    num = Math.floor(hp / 5);
    hp = hp % 5;
    num = num + Math.floor(hp / 3);
    hp = hp % 3;
    num = num + Math.floor(hp / 1);
    hp = hp % 1;
    
    return num;
}