const person = {
  fullname: function(city, country) {
    return this.firstName + " " + this.lastName + ", " + city + ", " + country;
  }
};

const person1 = {
  firstName: "Ahmed",
  lastName: "Haji"
};

const person2 = {
  firstName: "Abdul",
  lastName: "Farhan"
};

// Using call(): arguments passed individually
const resultCall = person.fullname.call(person1, "Hyderabad", "India");

// Using apply(): arguments passed as array
const resultApply = person.fullname.apply(person2, ["Istanbul", "Turkey"]);

console.log("Using call(): " + resultCall);
console.log("Using apply(): " + resultApply);
