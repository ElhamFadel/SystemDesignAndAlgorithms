// Data Structure
// linked list : a linked list is a data structure that consists of a group of nodes which together represent a sequence.
// Each node contains data and a link to the next node in the sequence.
// head: the first node in the linked list
// tail: the last node in the linked list
// size: the number of nodes in the linked list
// Node class
class Node {
    constructor(data,next=null){
        this.data=data;
        this.next=next;
    }
}
class LinkedList {
    constructor(){
        this.head = null //so if linked list will be empty we head equal null
        this.size=0; 
    }
    //1- insert node in the first 
    insertFirst(data){
        // create new node 
        // this node will take the previous head
        // then we will update this head
        //يعني بنعطي القديم وبناخد الجديد
         this.head = new Node(data,this.head)
         this.size++;
         return;
    }
    //2- insert node in the last 
   insertLast(data){
       let current = this.head
       if(!current)  return insertFirst(data)
       while(current.next){
          current = current.next
       }
       current.next = new Node(data,current.next)
       this.size++;
       
   }

    //3- insert node at specific index
     insertAtIndex(data,index){
         if(index<0 && index>this.size){
              throw new Error("Out of Range")
         }
         if(index===0) return this.insertFirst(data)
         let currnet, previous ;
         currnet = this.head;
         let count = 0;
         while(count < index){
             previous = currnet;
             count++;
             currnet = currnet.next
         }
         
        previous.next = new Node(data,currnet)
        this.size++;
        return;
     }
     

    //4- get at index 
    getAtIndex(index){
        let current = this.head;
        let count = 0;
        while(current){
            if(count == index){
                console.log(current.data)
            }
            count++;
            current = current.next
        }
        return null;
    }
    //5- remove at index
    removeAtIndex(index){
        if(index<0&&index>this.size)  throw new Error("Out of Range")
        let current = this.head
        let previous;
        let count = 0;
        if(index === 0) this.head = current.next
        while(count < index){
            count++;
            previous = current;
            current = current.next
        }
       
       previous.next = current.next
       this.size--
    } 
    //6- clear lisr
    clearList (){
        this.head = null
        this.size = 0
    }
    //7- print list data
    printDataList(){
        // we wil print data 
        // so the first step will be create a simple varible
        // then we will iterate over all value 
        
        let current = this.head
        while(current){
            console.log(current.data)
            current = current.next
        }
    }
}
const myLL = new LinkedList();
myLL.insertFirst("Saleem");
myLL.insertFirst("Elham");
myLL.insertLast("Elshami")
myLL.insertAtIndex("Fadel",1)
myLL.printDataList()
// console.log(myLL)