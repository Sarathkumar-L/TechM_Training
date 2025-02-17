//object - [single-line]
const person_john = {firstName:"John", lastName:"Doe", age:50, eyeColor:"blue"};
console.log(person_john)


//object - [multiple-line]
const person_sk = {
  firstName: "sarath",
  lastName: "kumar",
  age: 20,
  eyeColor: "brown"
};
console.log(person_sk)


// Create an Object with adding properties
const person_sudh = {};
// Add Properties
person_sudh.firstName = "sudhu";
person_sudh.lastName = "Reddy garu";
person_sudh.age = 20;
person_sudh.eyeColor = "blue";
console.log(person_sudh)


let age1 = person_sk.age;
console.log(person_sk.firstName + " is " + age1 + " years old.");

let age2 = person_john["age"];
console.log(person_john["firstName"] + " is " + age2 + " years old.");

person_john.nationality = "Americann";
console.log(person_john);

delete person_john.age;
console.log(person_john);
