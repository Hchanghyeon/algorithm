function solution(s) {
    const array = s.split(' ');
    let result = '';
    
    for(let i=0; i < array.length; i++){
        if(isNaN(array[i].charAt(0))){
            let alpabetArr = array[i].split('');
            let first = alpabetArr[0].toUpperCase();
            let lowerArr = alpabetArr.map((item, i) => {
                if(i !== 0) return item.toLowerCase();
            })
            lowerArr.unshift(first);
            array[i] = lowerArr.join('');
        } else {
            array[i] = array[i].toLowerCase();
        }
    }
    
    result = array.join(' ');
    return result;
}