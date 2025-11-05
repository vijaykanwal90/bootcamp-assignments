// 6. Filter Even Numbers
// Write a function filterEvens that takes an array of numbers and returns a new array containing only the even numbers. Use the filter method.
// Example:
// filterEvens([1, 2, 3, 4, 5, 6]); // Output: [2, 4, 6]

let filterEvens = (arr) => {
  const result = arr.filter((number) => number % 2 === 0);
  return result;
};
let arr = [1, 2, 3, 4, 5, 6, 6, 7, 8, 32, 221];
let ans = filterEvens(arr);
console.log(ans);
