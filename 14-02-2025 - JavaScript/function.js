//without parameter.
function myFunction()
{
console.log("Inside Function!")
}
myFunction()


//with parameter
function sum(x, y) { 
    return x + y; 
}
console.log(sum(6, 9));


//function as expression with parameter
var sum = function (x, y) {
    return x + y;
};
console.log(sum(4, 5));


//arrow function
let sumss = (a, b) => a + b;
console.log(sumss(1, 2)) 


