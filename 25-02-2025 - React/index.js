import React from 'react';
import ReactDOM from 'react-dom/client';

function Cricket() {
  const shoot = () => {
    alert("Hallo from Cricket()");
  }
  return (
    <button onClick={shoot}>Touch me!</button>
  );
}
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(<Cricket />);
