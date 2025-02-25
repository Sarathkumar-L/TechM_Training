// check if the given string's length is even or odd and display the results

import React from 'react';
import ReactDOM from 'react-dom/client';

function EvenDigit(props) {
	return <h1>{props.sk} - 's length is Even!  </h1>
}
function OddDigit(props) {
	return <h1>{props.ks} - 's length is Odd!</h1>
}

function CheckNumber(props) {
  const a = props.num1;
  const b=a.length;
  if (b%2==0) {
    return <EvenDigit sk={a}/>
  }
  return <OddDigit ks={a}/>
}

const root = ReactDOM.createRoot(document.getElementById('sk'));
root.render(<CheckNumber num1="sarath" />);
