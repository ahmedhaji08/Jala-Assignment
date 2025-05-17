function greet(name) {
  console.log("Function greet called with:", name);
  if (!name) {
    console.log("No name provided!");
    return;
  }
  console.log("Greeting:", "Hello, " + name);
}

greet("Ahmed");
greet();
