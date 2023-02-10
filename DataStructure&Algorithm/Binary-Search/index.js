const arr = [2,5,9,12,32,33,45,50,60];

const binarySearchAlgorithm = (arr, target)=>{

    //1- get mid elmenet
    let  midIndex = ~~(arr.length/2);
    console.log(midIndex);
    //2- compare middle item with target
    if(arr[midIndex]=== target) return midIndex;
    if(arr[midIndex]>target){
       midIndex =  ~~((midIndex + arr.length)/2)
    }else{
         midIndex =  ~~((0 + midIndex)/2)
    }

}

binarySearchAlgorithm(arr,5);