
let student = {
    name: "John",
    age: 21,
    course: "Computer Science",
    getDetails: function () {
        return `Name: ${this.name}, Age: ${this.age}, Course: ${this.course}`;
    }
};
console.log(student.getDetails());

student.address = {
    city: "New York",
    country: "USA"
};

student.setAge = function (newAge) {
    this.age = newAge;
};

student.getAddress = function () {
    return `City: ${this.address.city}, Country: ${this.address.country}`;
};

console.log(student.getAddress());
student.setAge(22);
console.log(student.getDetails());

delete student.course;
delete student.setAge;

console.log(student);
