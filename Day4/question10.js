// 10. Data Manipulation using Array functions
// Write a function that manipulates data in such a way that it returns an array of objects again but with the selected keys only.
// Input:
// [{
// "id": 1,
// "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
// "price": 109.95,
// "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
// "category": "men's clothing",
// "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
// "rating": {
// "rate": 3.9,
// "count": 120
// }
// }]

// Output: 

// [{
// "id": 1,
// "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
// "rate": 3.9,
// "count": 120
// }]

const data = [{
    "id": 1,
    "title": "Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops",
    "price": 109.95,
    "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    "category": "men's clothing",
    "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    "rating": {
        "rate": 3.9,
        "count": 120
    }
},
{
    "id": 2,
    "title": "Jacket - Foldsack No. 1 Backpack, Fits 15 Laptops",
    "price": 234.95,
    "description": "Your perfect pack for everyday use and walks in the forest. Stash your laptop (up to 15 inches) in the padded sleeve, your everyday",
    "category": "women's clothing",
    "image": "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
    "rating": {
        "rate": 4.9,
        "count": 180
    }
}
]

let maninpulationFunction = (data, keys) => {

    return data.map(item => {
        let result = {};

        for (let k of keys) {
            if (!(k in item)) {
                
                let nestedValue = findNestedValue(item, k);
                if (nestedValue !== undefined) {
                    result[k] = nestedValue;
                }
            }
            else {
                result[k] = item[k]
            }
        }

        return result;
    });

}
let findNestedValue = (obj, key) => {

    for (let prop in obj) {
        
        
        if (obj.hasOwnProperty(prop)) {
            
            if (prop === key) {
                
                return obj[prop];
            }
            
        
            if (typeof obj[prop] === 'object' && obj[prop] !== null) {
                
                const result = findNestedValue(obj[prop], key);
                if (result !== undefined) {
                    return result;
                }
            }
        }
    }
    return undefined; 
}
const keys = ["id", "title", "rate","count", "image"];
let resultantArray = maninpulationFunction(data, keys)
console.log(resultantArray)

