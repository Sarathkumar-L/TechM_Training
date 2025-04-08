var a=10
var b=20
let c=30
{
   let d=50
   console.log(d)
}
console.log(a+b)
var FruitName="Apple"
var count=7
var price=50
var totalPrice=price*count
console.log(FruitName)
console.log(totalPrice)
var a=90
console.log(typeof(a))

const aaaa="tst"
console.log(aaaa)


console.log(a*a*a)
let i = 11;
while (i <= 15) {
    console.log(i);
    i++;
}


const number = 17; 

function isPrime(num) {
    if (num < 2) return false;
    for (let i = 2; i <= Math.sqrt(num); i++) {
        if (num % i === 0) return false;
    }
    return true;
}

console.log(`${number} is ${isPrime(number) ? "a prime" : "not a prime"} number.`);
