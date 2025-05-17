const countBtn = document.getElementById('countBtn');
const countValue = document.getElementById('countValue');

let count = 0;

countBtn.addEventListener('click', () => {
  count++;
  countValue.textContent = count;
});
