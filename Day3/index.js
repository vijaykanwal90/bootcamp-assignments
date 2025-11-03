var productsData = [
    {
        "name":"Product1",
        "price":100,
        "category":"category1"
    },
    {
        "name":"Product2",
        "price":1234,
        "category":"category2"
    },
    {
        "name":"Product3",
        "price":1234,
        "category":"category3"
    },{
        "name":"Product4",
        "price":80,
        "category":"category4"
    }
]
var discountPercentage = 10;
function Product(name , price,category){
    this.name = name;
    this.price= price;
    this.category= category;
}
function getCostliestProduct (products){
    var highestpriceProduct = this[0];
    this.forEach(product=>{
        if(product.price > highestpriceProduct.price){
            highestpriceProduct= product;
        }
    })
    return highestpriceProduct;
}
function displayData(products){

    var mainsection = document.getElementsByClassName('main-section')[0]
    
    var highestPrice = document.createElement('div')
    var highestPriceProduct = getCostliestProduct.call(products)
    console.log(highestPriceProduct)
    highestPrice.textContent= `The Costliest product is ${highestPriceProduct.name} with price ${highestPriceProduct.price}`
    
    mainsection.appendChild(highestPrice);
    highestPrice.style.gridColumn = '1 / -1';
    products.forEach(product => {
        var productBox = document.createElement('div')
        var discountPrice = product.getDiscountedPrice(10)
         productBox.classList.add('product-box')
         productBox.id = `${product.name}`
        productBox.innerHTML= `<h2>${product.name}</h1>`;

        productBox.innerHTML+= `<p class='original-price'>${product.price}</p>`;
        productBox.innerHTML+= `<p class='discount-price'>${discountPrice}</p>`;

        productBox.innerHTML+= `<p>${product.category}</p>`;
        

        mainsection.appendChild(productBox)
        
    });

}
function mouseEvent(){
    var cards = document.querySelectorAll('.product-box');
    
    cards.forEach(card=>{
        
        card.addEventListener('mouseover',function(event){
            card.style.backgroundColor='#606565ff';
            card.style.scale='1.1';

        })
        card.addEventListener('mouseout',function(event){
            card.style.backgroundColor='';
            card.style.scale='1';
        })
    })
}
function main(){
    // hardcoded way for smalldata set 
    // var product1 = new Product('product1',100,'category1');
    // var product2 = new Product('product2',200,'category2');
    // var product3 = new Product('product3',1234,'category3');
    // var product4 = new Product('product4',400,'category4');
    // var products = [product1,product2,product3,product4]

    // Creating product objects using map 
    var products= productsData.map((product)=>{
        
        return new Product(product.name,product.price,product.category)
    })
   
    
    Product.prototype.getDiscountedPrice = function(discountPercentage){
      var discountPrice = (this.price * discountPercentage)/100;
      var finalPrice = this.price - discountPrice;
      return finalPrice;
    }
    displayData(products)
    
}
( function (){
    main()
    mouseEvent()
})()