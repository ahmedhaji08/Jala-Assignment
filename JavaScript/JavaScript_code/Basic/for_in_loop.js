// Define an object with properties
const student = {
  name: "Ahmed",
  age: 21,
  course: "Web Development",
  location: "Hyderabad"
};

// Use for...in loop to iterate through the object properties
console.log("Student Information:");
for (let key in student) {
  console.log(`${key}: ${student[key]}`);
}
