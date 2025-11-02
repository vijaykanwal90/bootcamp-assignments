// 7. Array Mapping
// Write a function doubleValues that takes an array of numbers and returns a new array where each number is doubled. Use the map method.
// Example:
// doubleValues([1, 2, 3]); // Output: [2, 4, 6]

let arr = [1, 2, 8, 32, 221]
let doubleValues = (arr)=>{
   return arr.map(num => num*2)
}
console.log(arr)
let doubleArray = doubleValues(arr)
console.log(doubleArray)
