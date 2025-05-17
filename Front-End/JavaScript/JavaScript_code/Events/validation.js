const form = document.getElementById('myForm');
const usernameInput = document.getElementById('username');
const errorDiv = document.getElementById('error');

form.addEventListener('submit', function(event) {
  errorDiv.textContent = ""; // clear previous error

  if (usernameInput.value.trim() === "") {
    event.preventDefault(); // prevent form submission
    errorDiv.textContent = "Please enter your name.";
    usernameInput.focus();
  }
});
