const btn = document.getElementById('showDateBtn');
const display = document.getElementById('dateTimeDisplay');

btn.addEventListener('click', () => {
  const now = new Date();
  display.textContent = now.toLocaleString();
});
