const fruits = ["Banana", "Apple", "Orange", "Mango", "Pineapple", "Grapes"];
const fruitsList = document.getElementById('fruitsList');
const sortBtn = document.getElementById('sortBtn');

// Function to display fruits
function displayFruits(arr) {
  fruitsList.innerHTML = '';
  arr.forEach(fruit => {
    const li = document.createElement('li');
    li.textContent = fruit;
    fruitsList.appendChild(li);
  });
}

// Initial display
displayFruits(fruits);

// Sort descending on button click
sortBtn.addEventListener('click', () => {
  fruits.sort((a, b) => b.localeCompare(a));
  displayFruits(fruits);
});
