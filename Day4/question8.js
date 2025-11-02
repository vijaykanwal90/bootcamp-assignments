// 8. Find the Maximum
// Write a function findMax that takes an array of numbers and returns the largest number in the array. Use the spread operator.
// Example:
// findMax([3, 5, 7, 2, 8]); // Output: 8
let arr = [103, 432, 854, 323, 221]
let findMax =(arr)=>{
   return Math.max(...arr)
}
let ans = findMax(arr)
console.log(ans)