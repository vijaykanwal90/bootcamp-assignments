
// 9. Object and Array Destructuring
// Given the following data:
// const data =[
//   {
//     name: "Bob",
//     age: 24
//   },
//   {
//     name: "Alice",
//     age: 21
//   }
// ]

// Write a function that extracts the age as  “24”  and name as “Alice” and returns a sentence: "Alice’s age is 24."
const data =[
  {
    name: "Bob",
    age: 24
  },
  {
    name: "Alice",
    age: 21
  }
]
let extract = (data)=>{
        let [first, second] = data;
        let name = second.name;
        let age = first.age;
        return `${name}'s age is ${age}`
}
console.log(extract(data))