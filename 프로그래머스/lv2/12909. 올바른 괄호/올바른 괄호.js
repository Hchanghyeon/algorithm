function solution(s){
    let answer = true;
    const stack = [];
    s = s.split('');
    for(let i=0; i < s.length; i++){
        if(s[i] === "(") {
            stack.push(s[i]);
        } else {
            if(stack.length === 0) stack.push("(");
            else stack.pop();
        }
    }
    
    if(stack.length > 0) answer = false
    else answer = true;
    
    return answer;
}