// 11. Default Parameter
//  const fun = (name = "abc") => {
//         if (name) {
//           console.log("if", name);
//         } else {
//           console.log("else", name);
//         }
//       };

// fun("");
// Output ?

const fun = (name) => {
  if (name) {
    console.log("if", name);
  } else {
    console.log("else", name);
  }
};

fun("");

// Output: else
// The reason of output "else" is due to javascript treat empty string( "") as falsy value
// falsy values are - false , 0, "", null, undefined , NaN
