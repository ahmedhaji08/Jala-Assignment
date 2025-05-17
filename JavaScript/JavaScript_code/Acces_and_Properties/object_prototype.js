// Constructor function
function Person(firstName, lastName) {
  this.firstName = firstName;
  this.lastName = lastName;
}

// Adding properties and methods to the prototype
Person.prototype.fullName = function() {
  return this.firstName + " " + this.lastName;
};

Person.prototype.age = 22;  // Adding a property to the prototype

Person.prototype.greet = function() {
  return `Hello, my name is ${this.fullName()} and I am ${this.age} years old.`;
};

// Usage
const person1 = new Person("Ahmed", "Haji");

console.log(person1.fullName());   // Output: Ahmed Haji
console.log(person1.age);          // Output: 25
console.log(person1.greet());      // Output: Hello, my name is Ahmed Haji and I am 25 years old.
