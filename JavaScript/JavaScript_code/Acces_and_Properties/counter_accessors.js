const countDisplay = document.getElementById('countValue');
const incrementBtn = document.getElementById('incrementBtn');

const counter = {
  _count: 0,  // private property (convention)

  get count() {
    return this._count;
  },

  set count(value) {
    if (typeof value === 'number' && value >= 0) {
      this._count = value;
    } else {
      console.warn('Count must be a non-negative number');
    }
  }
};

// Display initial count
countDisplay.textContent = counter.count;

// Increment count on button click using setter
incrementBtn.addEventListener('click', () => {
  counter.count = counter.count + 1;  // Calls setter
  countDisplay.textContent = counter.count;  // Update UI
});
