// 2. Default Parameters
// Create a function greet that takes two parameters, name and message. If the message is not provided, it should default to "Welcome!". Use default parameters in your implementation.

let greet = (name, message) => {
  console.log(`${message}, ${name}`);
};
greet("vijay", "hi");
greet("vijay");

// output
// hi, vijay
// welcome, vijay
