// Function to set a cookie
function setCookie(name, value, days) {
  const d = new Date();
  d.setTime(d.getTime() + (days*24*60*60*1000));
  const expires = "expires="+ d.toUTCString();
  document.cookie = name + "=" + value + ";" + expires + ";path=/";
}

// Function to get a cookie by name
function getCookie(name) {
  const cname = name + "=";
  const decodedCookie = decodeURIComponent(document.cookie);
  const ca = decodedCookie.split(';');
  for(let i = 0; i < ca.length; i++) {
    let c = ca[i].trim();
    if (c.indexOf(cname) == 0) {
      return c.substring(cname.length, c.length);
    }
  }
  return "";
}

// Function to check if a cookie exists
function checkCookie(name) {
  const cookie = getCookie(name);
  return cookie !== "";
}

// DOM Elements
const setBtn = document.getElementById('setCookieBtn');
const checkBtn = document.getElementById('checkCookieBtn');
const getBtn = document.getElementById('getCookieBtn');
const result = document.getElementById('result');

// Set a cookie named 'username' with value 'Ahmed' valid for 7 days
setBtn.addEventListener('click', () => {
  setCookie('username', 'Ahmed', 7);
  result.textContent = "Cookie 'username' has been set.";
});

// Check if 'username' cookie exists
checkBtn.addEventListener('click', () => {
  if (checkCookie('username')) {
    result.textContent = "Cookie 'username' exists.";
  } else {
    result.textContent = "Cookie 'username' does NOT exist.";
  }
});

// Get the value of 'username' cookie
getBtn.addEventListener('click', () => {
  const val = getCookie('username');
  if(val !== "") {
    result.textContent = "Value of 'username' cookie: " + val;
  } else {
    result.textContent = "Cookie 'username' not found.";
  }
});
