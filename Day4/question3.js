// 3. Template Literals
// Write a function formatString that takes a name and an age and returns a sentence in the format:
// "Hello, my name is [name] and I am [age] years old."

let formatString = (name,age)=>{
    return `Hello, my name is ${name} and I am ${age} years old.`
}
console.log(formatString('vijay',23))
