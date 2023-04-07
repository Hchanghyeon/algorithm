function solution(n, arr1, arr2) {
    const num1 = [];
    const num2 = [];
    for(let i=0; i < n; i++){
        const value1 = arr1[i].toString(2).split('').map(Number);
        const value2 = arr2[i].toString(2).split('').map(Number);
         while(value1.length < n){
            value1.unshift(0);
        }
        num1.push(value1);
        
        while(value2.length < n){
            value2.unshift(0);
        }
        num2.push(value2);

    }
    
    const result = [];
    
    for(let i=0; i < n; i++){
        let str = "";
        for(let j=0; j < n; j++){
            if(num1[i][j] || num2[i][j]) {
                str += "#";
            }else {
                str += " ";
            }
        }
        result.push(str);
    }

    return result;

}