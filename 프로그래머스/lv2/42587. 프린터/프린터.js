function solution(priorities, location) {
    let answer = 0;
    const queue = new Queue();
    for(let i=0; i < priorities.length; i++){
        queue.enQueue([priorities[i], i]);
    }
    
    priorities.sort((a,b) => b-a);
    let count = 0;
    while(queue.size > 0){
        let currentValue = queue.peek().value[0];
        if(currentValue < priorities[count]){
            queue.enQueue(queue.deQueue());
        } else {      
            count++;
            if(queue.deQueue()[1] === location){
                return count;
            }
        }
    }
    
    return count;
}

class Node {
    constructor(value){
        this.value = value;
        this.next = null;
    }
}

class Queue {
    constructor(){
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
    
    enQueue(value){
        const newNode = new Node(value);
        if(this.head === null){
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
        this.size++;
    } 
    
    deQueue(){
        if(this.size !== 0){
            const value = this.head.value;
            this.head = this.head.next;
            this.size--;
            return value;
        } else {
            return "Queue is empty"
        }
    }
    
    peek(){
        return this.head;
    }
    
    
    size(){
        return this.size;
    }
}