// 5. Rest Operator
// Write a function sumAll that takes any number of arguments and returns their sum. Use the rest operator to handle the arguments.

let sumAll = (...numbers)=>{
  
     let sum =   numbers.reduce((acc,curr)=>{
        return acc + curr
       }, 0);
    
       return sum;
    
}

let sum = sumAll(2,3)
let sum2 = sumAll(2,3,4)
console.log(sum);
console.log(sum2)