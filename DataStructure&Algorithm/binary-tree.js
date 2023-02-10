// concept 

class Node{
    constructor(val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

const a = new Node(1);
const b = new Node(2);
const c = new Node(3);
const d = new Node(4);
const e = new Node(5);
const f = new Node(6);

a.left = b;
a.right = c;
b.left = d;
b.right = e;
c.left = f;
    //  1
    // /  \
    // 2    3
    // / \  / \
    // 4  5 6   null

//1 2 4 5 3 6 
// const depthFirstValue=(root)=>{
//     const stack = [root]
//     while(stack.length>0){
//         const current = stack.pop()
//         console.log(current.val)
//         if(current.right) stack.push(current.right)
//        if(current.left) stack.push(current.left)
//     }
// }
// depthFirstValue(a)
//------ using recursion
const depthFirstValue=(root)=>{
    if (root === null) return []
    const leftStack = depthFirstValue(root.left)//2 4 5
    const rightStack = depthFirstValue(root.right)//3 6
     return [root.val, ...leftStack, ...rightStack]
}
console.log(depthFirstValue(a))