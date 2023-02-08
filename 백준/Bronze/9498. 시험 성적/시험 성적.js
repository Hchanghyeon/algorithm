const fs = require('fs');
const input = parseInt(fs.readFileSync('/dev/stdin').toString().trim());

if(input <= 100 && input >= 90) console.log('A');
else if(input <= 89 && input >= 80) console.log('B');
else if(input <= 79 && input >= 70) console.log('C');
else if(input <= 69 && input >= 60) console.log('D');
else console.log('F');