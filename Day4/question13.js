// 13. Flatten Nested Arrays
// Write a function flattenArray that takes a nested array and returns a flattened array. Use recursion and/or ES6 methods to solve this problem.
// Example:
// flattenArray([1, [2, [3, [4, 5]]]]); // Output: [1, 2, 3, 4, 5]



let arr  = [1, [2, [3, [4, 5]]]]
let flattenArray = (arr, arr2)=>{
     for(let item of arr){
         
         if(!Array.isArray(item)){
            arr2.push(item)
         }
       
        else {
            flattenArray(item,arr2)

        }

     }
return arr2;
}
let arr2 = []
let result = flattenArray(arr, arr2)
console.log(result)