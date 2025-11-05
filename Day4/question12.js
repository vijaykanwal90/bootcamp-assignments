// 12. Deep Clone Objects
// Write a function deepClone that creates a deep copy of a given object. Ensure that nested objects and arrays are properly cloned without retaining references to the original object.
// Example:
// const obj = { a: 1, b: { c: 2 } };
// const clonedObj = deepClone(obj);
// clonedObj.b.c = 42;
// console.log(obj.b.c); // Output: 2

let deepClone = (obj) => {
  
  if (obj === null || typeof obj !== "object") {
    return obj;
  }

  let clone = Array.isArray(obj) ? [] : {};

  for (let key in obj) {
    if (obj.hasOwnProperty(key)) {
      clone[key] = deepClone(obj[key]);
    }
  }
  return clone;
};

const obj = { a: 1, b: { c: 2 } };
const arr = [1, 2, 3, 4];

const obj1 = deepClone(arr);

console.log(obj1, "obj1");


// obj1.b.c = 5;
// console.log(obj1.b.c); // 5

console.log(obj.b.c); // 2

const obj2 = deepClone(obj);
console.log(obj2.b.c); // 2

if (obj1 === obj2) {
  console.log("same reference");
} else {
  console.log("different reference");
}
